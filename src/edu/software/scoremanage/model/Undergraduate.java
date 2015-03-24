package edu.software.scoremanage.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Undergraduate extends Student {

	
	public Undergraduate(String id2, String name2, String password2,
			ArrayList<Course> courseList2, ArrayList<Request> requestList2) {
		super(id2, name2, password2, courseList2, requestList2);
	}


	

	public void startUndergra(){
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
		case '1':super.setPassword(password);
		case '2':super.setName(name);
		case '3':super.checkScore();
		case '4':super.total();
		case '5':super.average();
		case '6':request();
		case '7':checkResult();
		case '8':super.exit();
		default:System.out.println("Wrong operation!");
		       super.exit();		
		}
	}
	


	@Override
	public void request() {
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void checkResult() {
		// TODO Auto-generated method stub
		
	}
	
	
    
}
