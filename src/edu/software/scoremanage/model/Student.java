package edu.software.scoremanage.model;

import java.util.ArrayList;

public abstract class Student {
	String id;
	String name;
	String password;
	
	
	
	int totalScore;

	
	ArrayList<String> scoreList;
	ArrayList<Course> courseList;
	ArrayList<Request> requestList;
	
	
	public Student(String id2, String name2, String password2, ArrayList<Course> courseList2, ArrayList<Request> requestList2){
		id="no_id";
		name="no_name";
		password="no_password";
		courseList=null;
		requestList=null;
	}
	

	
	
	
	
	





	public void setName (String name){
		this.name=name;
	}
	public void setPassword(String password){
		this.password=password;
	}	
	public void setCourse(ArrayList<Course> courselist){
		this.courseList=courselist;
	}
	
	
	
	
	
	
	
	public void checkScore(){
		int scoreNumber=courseList.size();
		for(int i=0;i<scoreNumber;i++){
			System.out.println(courseList.get(i)+" "+scoreList.get(i));			
		}
		
		  
		
	}
	
	public double average(){
		
		int scoreNumber=courseList.size();
		int k=0;
		
		for(int i=0;i<scoreNumber;i++){
        k=k+Integer.parseInt(scoreList.get(i));			
		}
		
		double averageScore=k/scoreNumber;
		return averageScore;				
	}
    public int total(){
    	int scoreNumber=courseList.size();
    	int k=0;
    	for(int i=0;i<scoreNumber;i++){
            k=k+Integer.parseInt(scoreList.get(i));			
    		}
    	return totalScore=k;
    	
    }
    
    public abstract void request();
 
    public abstract void checkResult();
    
    
    public void exit(){
    	User user=new User();
    	user.start();
    	
    }
}
