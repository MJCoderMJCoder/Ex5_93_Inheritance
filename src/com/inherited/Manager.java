package com.inherited;

class Manager extends Employee {
	private String special;
	private double subsidy;		//����
	
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
		return "ְ��" + special + ", ������" + subsidy
				+ ", ������" + name + ", �������ʣ�" + salary + ", ���ţ�"
				+ department;
	}
	
	
}
