package com.mba.newsservice.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * News 
 * 
 * @author MBA
 *
 */
public class News implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("copyright")
	@Expose
	private String copyright;
	@SerializedName("num_results")
	@Expose
	private Integer numResults;
	@SerializedName("results")
	@Expose
	private List<NewsDetail> newsDetail;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Integer getNumResults() {
		return numResults;
	}

	public void setNumResults(Integer numResults) {
		this.numResults = numResults;
	}

	public List<NewsDetail> getNewsDetail() {
		return newsDetail;
	}

	public void setNewsDetail(List<NewsDetail> newsDetail) {
		this.newsDetail = newsDetail;
	}

}
