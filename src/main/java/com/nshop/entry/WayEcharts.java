package com.nshop.entry;

public class WayEcharts {
   private String pay_type;
   private String pay_amounts;
   
   
   
public WayEcharts() {
	super();
	// TODO Auto-generated constructor stub
}
public WayEcharts(String pay_type, String pay_amounts) {
	super();
	this.pay_type = pay_type;
	this.pay_amounts = pay_amounts;
}


public String getPay_type() {
	return pay_type;
}
public void setPay_type(String pay_type) {
	this.pay_type = pay_type;
}
public String getPay_amounts() {
	return pay_amounts;
}
public void setPay_amounts(String pay_amounts) {
	this.pay_amounts = pay_amounts;
}
   
   
}
