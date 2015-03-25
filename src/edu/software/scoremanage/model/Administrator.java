package edu.software.scoremanage.model;

import java.util.Scanner;

public class Administrator {
	String id;
	String name;
	String password;

	public Administrator(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	// 吴：交互不是在这里做，model包处理的是底层数据
	public void startAdmin() {
		
		System.out.println("Please choose your operation");
		System.out.println("1:Manage Course Infomation");
		System.out.println("2:Manage Course ");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			Curriculum curri = new Curriculum();
			curri.manageCourseInfo();
		case 2:
			Curriculum curri1 = new Curriculum();
			curri1.manageCourse();
		default:
			System.out.println("Wrong operation");
			User user = new User();
			user.start();

		}

	}

}
