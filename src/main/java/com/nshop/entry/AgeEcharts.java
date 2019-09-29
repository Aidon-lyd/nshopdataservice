package com.nshop.entry;

public class AgeEcharts {
    private String age_range;
    private int pay_amounts;
    
    
    
	public AgeEcharts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgeEcharts(String age_range, int pay_amounts) {
		super();
		this.age_range = age_range;
		this.pay_amounts = pay_amounts;
	}
	public String getAge_range() {
		return age_range;
	}
	public void setAge_range(String age_range) {
		this.age_range = age_range;
	}
	public int getPay_amounts() {
		return pay_amounts;
	}
	public void setPay_amounts(int pay_amounts) {
		this.pay_amounts = pay_amounts;
	}
    
    
    
}
