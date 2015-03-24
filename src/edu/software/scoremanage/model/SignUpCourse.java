package edu.software.scoremanage.model;

import java.io.*;
import java.util.Scanner;

public class SignUpCourse {
        String course;
        String student;
        String score;
        
        public void getScore(){
        	InputStreamReader isr=new InputStreamReader(System.in);
        	BufferedReader br=new BufferedReader(isr);
        	String s=null;
        	try{
        		s=br.readLine();
        		Scanner tempCourse=new Scanner(s);

        		int stuId=tempCourse.nextInt();
        		String name=tempCourse.next();
        		
        	}catch
        		
        }
}
