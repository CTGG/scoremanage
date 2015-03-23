package edu.software.scoremanage.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
   ArrayList<String> toBeCheckedList;
    String id;
	String name;
	String password;
	private ArrayList<String> courseList;
	
	public Teacher(String id,String name,String password){
		this.id=id;
		this.name=name;
		this.password=password;	
	}
	
	public void addCheckApp(){
		
	}
	
	// 吴：反正java本身就是很繁琐的语言，就把必要把dent省了吧，addStudent不算长了，真有太长的才考虑简写
	public void addStu(String id){
		System.out.println("Please input id,name,course and seperate them with space");
		
		
		try{
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			String temp = br1.readLine();
		    String[] info=temp.split(" ");
		   
			courseList.add(info[0]);
			courseList.add(info[1]);
			courseList.add(info[2]);
		    
		    
		     		
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void removeStu(String id) {
		System.out.println("Please input the id of stu to be removed");
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String stuId=br.readLine().trim();
		this.removeStu(stuId);
		}catch(IOException e){
			e.setStackTrace(null);
		}
	}
	
	public void resetScore(){
		System.out.println("Please input id,name,course and seperate them with space");
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String temp=null;
		temp=br.readLine();
		}catch(IOException e){
			
			e.setStackTrace(null);
		}
	}
	public void startTea(){
		
			
			System.out.println("Please choose your operation");
			System.out.println("1:Add score checking application");
			System.out.println("2:Add student ");
			System.out.println("3:Remove student");
			System.out.println("4:Exit");
			
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			
			switch(i){
			case '1':
				Teacher tea=new Teacher(id, name, password);
				tea.addCheckApp();
			case '2':
				Teacher tea1=new Teacher(id, name, password);
				tea1.addStu(id);
			case '3':
				Teacher tea11=new Teacher(id, name, password);
				tea11.removeStu(id);
			case '4':
				User user=new User();
		    	user.start();
			default:
				System.out.println("Wrong operation");
				User user1=new User();
		    	user1.start();
		    	
				
			}
	}

}
