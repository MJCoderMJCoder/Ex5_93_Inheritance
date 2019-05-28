package com.inherited;

public class Inheritance {	//inheritance：遗传、继承；

	public static void main(String[] args) {
		Manager mrZhang = new Manager();
		mrZhang.setName("张刚");
		mrZhang.setDepartment("教务处");
		mrZhang.setSalary(2500);
		mrZhang.setSpecial("教务处处长");
		mrZhang.setSubsidy(500);
		System.out.println("******************员工信息*******************");
		System.out.println();
		System.out.print(mrZhang.toString());

	}

}
