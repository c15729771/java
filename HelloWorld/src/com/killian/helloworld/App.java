package com.killian.helloworld;
import java.util.Scanner;
import java.util.ArrayList;
public class App {
	
	public static ArrayList <Student> studentList = new ArrayList<Student>();
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("how many students?");
		int number = scan.nextInt();
		
		getInfo(number);
		
		//iterating through array lists
		for(Student s: studentList){
			System.out.println(s);
			
		}
		
		
		
		
		
		
		
	}//end main
	
	public static void getInfo(int number){
		
		for(int i=0;i<number;i++){
			System.out.println("Enter student name:");
			String name = scan.next();
			
			System.out.println("Ener Student Id:");
			String id = scan.next();
			
			Student s = new Student(name,id);
			studentList.add(s);
			
		}
	
		
		
	}

}
