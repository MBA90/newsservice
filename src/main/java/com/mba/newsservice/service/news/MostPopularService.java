package com.mba.newsservice.service.news;

import com.mba.newsservice.model.News;

/**
 * Most Popular Service
 * 
 * @author MBA
 *
 */
public interface MostPopularService {

	/**
	 * Get Most Popular News Used to get Most popular news from rest API
	 * 
	 * @param section
	 * @param period
	 * @return News
	 * @throws Exception
	 */
	public News getMostPopularNews(String section, String period) throws Exception;
}
