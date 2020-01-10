package com.pratian.billingandgatewayTests.Page;

public interface PageInterface {
	
	boolean urlContains(String url);
	boolean titleContains(String title);
	boolean urlIs(String url);
	boolean titleIs(String title);
	String getTitle();
	String getUrl();
	void reload();

}
