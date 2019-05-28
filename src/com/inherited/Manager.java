package com.inherited;

class Manager extends Employee {
	private String special;
	private double subsidy;		//津贴
	
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	@Override
	public String toString() {
		return "职务：" + special + ", 津贴：" + subsidy
				+ ", 姓名：" + name + ", 基本工资：" + salary + ", 部门："
				+ department;
	}
	
	
}
