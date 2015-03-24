package edu.software.scoremanage.model;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	Administrator admin;
	ArrayList<Student> studentList;
	ArrayList<Teacher> teacherList;
	public User(){
		admin=new Administrator(null, null, null);
		studentList=new ArrayList<Student>();
		teacherList=new ArrayList<Teacher>();		
	}
	public void start(){
		System.out.println("Welcome to Student Score Management System!");
		System.out.println("Please choose your identity:");
		System.out.println("1:Administrator");
		System.out.println("2:Teacher");
		System.out.println("3:Graduate");
		System.out.println("4:Undergraduate");
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		
		switch(i){
		case '1':
			Administrator admin=new Administrator( null, null, null);
		    admin.startAdmin();
			   break;
		case '2':
			Teacher teacher=new Teacher( null, null, null);
		    teacher.startTea();
			   break;
		case '3':
			 Graduate gra=new Graduate( null, null, null, null, null);
			 gra.startGra();
		    	break;
		case '4':
			 Undergraduate undergra=new Undergraduate( null, null, null, null, null);
			 undergra.startUndergra();
			   break;
	    default:
	    	System.out.println("Invalid choice.Please try again.");
	    	User user=new User();
	    	user.start();
	    	
	    	break;
		}
	}
    public static void main(String[] args){
    	User user=new User();
    	user.start();
    }		
	
	
	
	
	
}	
		
	/*public Message addStudent(String id,String name,String password){
		
		
		
		private Student searchStudent(String id1) {
		
		// TODO Auto-generated method stub
		return null;
	   }
		Student student=searchStudent(id1);
		if(student!=null){
			return Message.STUDENT_EXIST;
			
		}
		
		
		int type;
		
		switch(type){
		case 1:studentList.add(new Undergraduate(id1,name,password));
		       break;
		case 2:studentList.add(new Graduate(id1,name,password));
		      break;
		case 3:teacherList.add(new Teacher());
		      break;
		}
		return Message.ADD_STU_OR_TEACHER_SUCCESS;
		
	}
	
	

}

*/
