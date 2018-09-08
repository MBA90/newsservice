package com.mba.newsservice.view.news;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mba.newsservice.model.News;
import com.mba.newsservice.model.NewsDetail;
import com.mba.newsservice.service.news.MostPopularService;
import com.mba.newsservice.service.news.MostPopularServiceImpl;

/**
 * Most Popular Bean
 * 
 * @author MBA
 *
 */
@ManagedBean(name = "mostPopular")
@RequestScoped
public class MostPopularBean {

	private String section;

	private String period;

	private List<String> sectionList;

	private List<String> periodList;

	private News news;

	private List<NewsDetail> newsDetailList;

	/**
	 * Init
	 * 
	 */
	@PostConstruct
	public void init() {
		setSectionList(fillSection());
		setPeriodList(fillPeriod());
	}
	
	/**
	 * Do Most Popular News Search
	 * 
	 * @return string to navigate to success or error page
	 */
	public String doMostPopularNewsSearch() {
		try {
			// create instance to get access to MostPopularServiceImpl
			MostPopularService mostPopualrService = new MostPopularServiceImpl();
			
			// set result in news object after calling service impl class
			setNews(mostPopualrService.getMostPopularNews(section, period));
			
			// check for null and list size
			if (getNews() != null && getNews().getNewsDetail() != null && getNews().getNewsDetail().size() > 0) {
				setNewsDetailList(getNews().getNewsDetail());
			}
			
			return "success";
		} catch (Exception ex) {
			return "error";
		}
	}

	/**
	 * Get Section.
	 * 
	 * Used as a parameter for most popular service.
	 * 
	 * Note: Due to limited time i hard coded otherwise i will read this from
	 * database nether file
	 * 
	 * @return list of section
	 */
	public List<String> fillSection() {

		List<String> section = new ArrayList<String>();
		section.add("Arts");
		section.add("Automobiles");
		section.add("Blogs");
		section.add("Books");
		section.add("Business Day");
		section.add("Education");
		section.add("Fashion & Style");
		section.add("Food");
		section.add("Health");
		section.add("Job Market");
		section.add("Magazine");
		section.add("membercenter");
		section.add("Movies");
		section.add("Multimedia");
		section.add("NYT Now");
		section.add("Obituaries");
		section.add("Open");
		section.add("Opinion");
		section.add("Public Editor");
		section.add("Real Estate");
		section.add("Science");
		section.add("Sports");
		section.add("Style");
		section.add("Sunday Review");
		section.add("T Magazine");
		section.add("Technology");
		section.add("The Upshot");
		section.add("Theater");
		section.add("Times Insider");
		section.add("Today’s Paper");
		section.add("Travel");
		section.add("U.S.");
		section.add("World");
		section.add("Your Money");
		section.add("all-sections");

		return section;
	}

	/**
	 * Get Period.
	 * 
	 * Used as a parameter for most popular service.
	 * 
	 * Note: Due to limited time i hard coded otherwise i will read this from
	 * database nether file
	 * 
	 * @return list of section
	 */
	public List<String> fillPeriod() {
		List<String> period = new ArrayList<String>();
		period.add("1");
		period.add("7");
		period.add("30");

		return period;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public List<String> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<String> sectionList) {
		this.sectionList = sectionList;
	}

	public List<String> getPeriodList() {
		return periodList;
	}

	public void setPeriodList(List<String> periodList) {
		this.periodList = periodList;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public List<NewsDetail> getNewsDetailList() {
		return newsDetailList;
	}

	public void setNewsDetailList(List<NewsDetail> newsDetailList) {
		this.newsDetailList = newsDetailList;
	}

}
