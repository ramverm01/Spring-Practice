package com.nit.SetterInjectionwithPrimitiveType;

public class Book 
{
	private String title;
	private int price;
	private int pages;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", pages=" + pages + "]";
	}
	
	
	
	
}
