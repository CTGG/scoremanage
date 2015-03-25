package edu.software.scoremanage.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Graduate extends Student implements Serializable{
	
	public Graduate(String id, String name, String password,ArrayList<Course> courseList,ArrayList<Request> requestList) {
		super(id, name, password, courseList, requestList);
	}

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void request() {
		
	}

	@Override
	public void checkResult() {
		
	}
	
	// 吴：交互不在这里啦
	public void startGra(){
		System.out.println("Please choose your operations:");
		System.out.println("1:Reset  password");
		System.out.println("2:Reset name");
		System.out.println("3:Check scores");
		System.out.println("4:Get total score");
		System.out.println("5:Get average score");
		System.out.println("6:Request score confirmation");
		System.out.println("7:Get score confirmation result");
		System.out.println("8:Exit");
		
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		switch(i){
		case 1:super.setPassword(password);
		case 2:super.setName(name);
		case 3:super.checkScore();
		case 4:super.total();
		case 5:super.average();
		case 6:request();
		case 7:checkResult();
		case 8:super.exit();
		default:System.out.println("Wrong operation!");
		       super.exit();		
		}
	}
	
	
	
	

}
