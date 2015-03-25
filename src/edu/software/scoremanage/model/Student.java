package edu.software.scoremanage.model;

import java.util.ArrayList;

public abstract class Student {
	String id;
	String name;
	String password;
	
	
	
	int totalScore;

	// 吴：为毛scoreList的类型参数是String……
	ArrayList<String> scoreList;
	ArrayList<Course> courseList;
	ArrayList<Request> requestList;
	
	// 吴：既然初始化时courseList和requestList是null，就没必要传参，而且你确定是null不是new？
	public Student(String id2, String name2, String password2, ArrayList<Course> courseList2, ArrayList<Request> requestList2){
		id="no_id";
		name="no_name";
		password="no_password";
		courseList=null;
		requestList=null;
	}
	

	
	
	// 吴：这里好空啊~~~~不过留白这么多木有必要吧
	
	





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
	
	// 吴：这里是不是能用下面total的代码来简化？
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
    	
    	// 吴：省点代码可以用foreach，而且假如你用了totalScore作成员变量k也没必要引进来
    	int scoreNumber=courseList.size();
    	int k=0;
    	for(int i=0;i<scoreNumber;i++){
            k=k+Integer.parseInt(scoreList.get(i));			
    		}
    	return totalScore=k;
    	
    }
    
    public abstract void request();
 
    public abstract void checkResult();
    
    // 吴：意义不明
    public void exit(){
    	User user=new User();
    	user.start();
    	
    }
}
