package edu.software.scoremanage.model;

import java.util.ArrayList;

public class Course {
	String courseId;
	String teacher;
	String year;
	
	// 吴：让一个course持有courseList真的好吗？
	ArrayList<Course> courseList;
	// 吴：应该是SignUpCourse的list，因为它除了成绩还有学生信息
	ArrayList<String>  scoreList;
	
	// 吴：这个应该是没写完，不过提醒一下数据读写一般用set和get开头，软工一应该有讲
	// 还没写好的地方，自己加个 TODO 注释，你看滚动条右边是不是有个小蓝点？一戳就到相应地方
	public void modifyTea(){
		
	}
	
	public void modifyYear(){
		
	}
	public void modifyList(){
		
	}
	public int averageScore(){
		int a=0;
		
		return a;
	}
	public  void score(){
		
	}

}
