package com.mba.newsservice.service.news;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.mba.newsservice.model.News;
import com.mba.newsservice.util.Common;

/**
 * Most Popular Service Impl to implement service
 * 
 * @author MBA
 *
 */
public class MostPopularServiceImpl implements MostPopularService {

	/** Base URI service */
	private static String BASE_URI = "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/";

	private static final String API_KEY = "47701b076d9646c9ac9ea2bac74f5409";

	private static final int HTTP_STATUS_OK = 200;

	/**
	 * Get Most Popular News Used to get Most popular news from rest API
	 * 
	 * @param section
	 * @param period
	 * @return News
	 * @throws Exception
	 */
	@Override
	public News getMostPopularNews(String section, String period) throws Exception {

		News news = null;
		
		// Create client
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(BASE_URI);

		Response response = null;

		try {
			// Check blank or null
			if (!Common.isBlankOrNull(section) || Common.isBlankOrNull(period)) {
				throw new Exception("Error: Section & period both are mandatory");
			}
			
			// append path and query param to webtarget object
			target = target.path("{section}").resolveTemplate("section", section).path("{period}")
					.resolveTemplate("period", period).path(".json").queryParam("apikey", API_KEY);
			
			// request Http get method and store the result at response object
			response = target.request(MediaType.APPLICATION_JSON).get();
			
			// check response status 
			if (response.getStatus() != HTTP_STATUS_OK) {
				throw new Exception("Failed : HTTP error code : " + response.getStatus());
			} else {
				// store response in string object
				String result = response.readEntity(String.class);
				
				// check blank or null
				if (!Common.isBlankOrNull(result)) {
					// using gson object to parse data from json to news object
					Gson gson = new Gson();
					news = gson.fromJson(result, News.class);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception(ex.getMessage());

		} finally {
			// close response and client object connection 
			if (response != null) {
				response.close();
			}
			client.close();
		}
		return news;
	}
}
