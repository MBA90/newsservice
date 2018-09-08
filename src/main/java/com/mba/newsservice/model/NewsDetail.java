package com.mba.newsservice.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * News Detail 
 * 
 * @author MBA
 *
 */
public class NewsDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SerializedName("url")
	@Expose
	private String url;
	
	@SerializedName("adx_keywords")
	@Expose
	private String adxKeywords;
	
	@SerializedName("column")
	@Expose
	private String column;
	
	@SerializedName("section")
	@Expose
	private String section;
	
	@SerializedName("byline")
	@Expose
	private String byline;
	
	@SerializedName("type")
	@Expose
	private String type;
	
	@SerializedName("title")
	@Expose
	private String title;
	
	@SerializedName("abstract")
	@Expose
	private String summry;
	
	@SerializedName("published_date")
	@Expose
	private String publishedDate;
	
	@SerializedName("source")
	@Expose
	private String source;
	
	@SerializedName("id")
	@Expose
	private String id;
	
	@SerializedName("asset_id")
	@Expose
	private String assetId;
	
	@SerializedName("views")
	@Expose
	private Integer views;
	
	@SerializedName("des_facet")
	@Expose
	private transient List<String> desFacet;

	@SerializedName("org_facet")
	@Expose
	private transient List<String> orgFacet;
	
	@SerializedName("per_facet")
	@Expose
	private transient List<String> perFacet;
	
	@SerializedName("geo_facet")
	@Expose
	private transient String geoFacet;
	
	@SerializedName("media")
	@Expose
	private List<Media> media;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAdxKeywords() {
		return adxKeywords;
	}

	public void setAdxKeywords(String adxKeywords) {
		this.adxKeywords = adxKeywords;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getByline() {
		return byline;
	}

	public void setByline(String byline) {
		this.byline = byline;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummry() {
		return summry;
	}

	public void setSummry(String summry) {
		this.summry = summry;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public List<String> getDesFacet() {
		return desFacet;
	}

	public void setDesFacet(List<String> desFacet) {
		this.desFacet = desFacet;
	}

	public List<String> getOrgFacet() {
		return orgFacet;
	}

	public void setOrgFacet(List<String> orgFacet) {
		this.orgFacet = orgFacet;
	}

	public List<String> getPerFacet() {
		return perFacet;
	}

	public void setPerFacet(List<String> perFacet) {
		this.perFacet = perFacet;
	}

	public String getGeoFacet() {
		return geoFacet;
	}

	public void setGeoFacet(String geoFacet) {
		this.geoFacet = geoFacet;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

}
