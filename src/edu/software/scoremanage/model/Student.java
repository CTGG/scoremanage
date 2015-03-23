package edu.software.scoremanage.model;

import java.util.ArrayList;

public abstract class Student {
	String id;
	String name;
	String password;
	
	
	
	int totalScore;

	// �⣺ΪëscoreList�����Ͳ�����String����
	ArrayList<String> scoreList;
	ArrayList<Course> courseList;
	ArrayList<Request> requestList;
	
	// �⣺��Ȼ��ʼ��ʱcourseList��requestList��null����û��Ҫ���Σ�������ȷ����null����new��
	public Student(String id2, String name2, String password2, ArrayList<Course> courseList2, ArrayList<Request> requestList2){
		id="no_id";
		name="no_name";
		password="no_password";
		courseList=null;
		requestList=null;
	}
	

	
	
	// �⣺����ÿհ�~~~~����������ô��ľ�б�Ҫ��
	
	





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
	
	// �⣺�����ǲ�����������total�Ĵ������򻯣�
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
    	
    	// �⣺ʡ����������foreach�����Ҽ���������totalScore����Ա����kҲû��Ҫ������
    	int scoreNumber=courseList.size();
    	int k=0;
    	for(int i=0;i<scoreNumber;i++){
            k=k+Integer.parseInt(scoreList.get(i));			
    		}
    	return totalScore=k;
    	
    }
    
    public abstract void request();
 
    public abstract void checkResult();
    
    // �⣺���岻��
    public void exit(){
    	User user=new User();
    	user.start();
    	
    }
}
