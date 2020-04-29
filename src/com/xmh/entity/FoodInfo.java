package com.xmh.entity;

/**
 * ��Ʒ
 */
public class FoodInfo {
	private int mealId;
	private Integer mealSeriesId;
	private String mealName;
	private String mealSummarize;
	private String mealDescription;
	private double mealPrice;
	private String mealImage;
	private Cuisine cuisine;
	
	
	public FoodInfo(int mealId, Integer mealSeriesId, String mealName, String mealSummarize, String mealDescription,
			double mealPrice, String mealImage,Cuisine cuisine) {
		super();
		this.mealId = mealId;
		this.mealSeriesId = mealSeriesId;
		this.mealName = mealName;
		this.mealSummarize = mealSummarize;
		this.mealDescription = mealDescription;
		this.mealPrice = mealPrice;
		this.mealImage = mealImage;
		this.cuisine=cuisine;
	}
	public FoodInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	public int getMealId() {
		return mealId;
	}
	public void setMealId(int mealId) {
		this.mealId = mealId;
	}
	public Integer getMealSeriesId() {
		return mealSeriesId;
	}
	public void setMealSeriesId(Integer mealSeriesId) {
		this.mealSeriesId = mealSeriesId;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public String getMealSummarize() {
		return mealSummarize;
	}
	public void setMealSummarize(String mealSummarize) {
		this.mealSummarize = mealSummarize;
	}
	public String getMealDescription() {
		return mealDescription;
	}
	public void setMealDescription(String mealDescription) {
		this.mealDescription = mealDescription;
	}
	public double getMealPrice() {
		return mealPrice;
	}
	public void setMealPrice(double mealPrice) {
		this.mealPrice = mealPrice;
	}
	public String getMealImage() {
		return mealImage;
	}
	public void setMealImage(String mealImage) {
		this.mealImage = mealImage;
	}
	@Override
	public String toString() {
		return "FoodInfo [mealId=" + mealId + ", mealSeriesId=" + mealSeriesId + ", mealName=" + mealName
				+ ", mealSummarize=" + mealSummarize + ", mealDescription=" + mealDescription + ", mealPrice="
				+ mealPrice + ", mealImage=" + mealImage + ", cuisine=" + cuisine + "]";
	}
	
	
}
