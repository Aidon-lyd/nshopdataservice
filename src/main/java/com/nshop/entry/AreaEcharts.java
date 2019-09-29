package com.nshop.entry;

public class AreaEcharts {
   private String customer_area_code;
   private String pay_amounts;
   
   
   
public AreaEcharts() {
	super();
	// TODO Auto-generated constructor stub
}
public AreaEcharts(String customer_area_code, String pay_amounts) {
	super();
	this.customer_area_code = customer_area_code;
	this.pay_amounts = pay_amounts;
}
public String getCustomer_area_code() {
	return customer_area_code;
}
public void setCustomer_area_code(String customer_area_code) {
	this.customer_area_code = customer_area_code;
}
public String getPay_amounts() {
	return pay_amounts;
}
public void setPay_amounts(String pay_amounts) {
	this.pay_amounts = pay_amounts;
}
   
   
}
