package com.Assignments;

public class StudentMain{
   public static void stdNoFee(int No,int Fee) {
	   if(Fee < 2000) {
		   Fee=Fee+(Fee*10/100);
	   }
	   System.out.println("Student No "+No+" Student Fee "+Fee);
	   
   }
   public static void main(String[] args) {
	Student[] s=new Student[5];  // array of student 
	s[0]=new Student(1,"dvc123@gmail.com","London","Devid",2000);
	s[1]=new Student(2,"ben123@gmail.com","Paris","Binod",4000);

	s[2]=new Student(3,"abc123@gmail.com","Diago","USA",1000);

	s[3]=new Student(4,"dvc123@gmail.com","Sona","UK",5000);

	s[4]=new Student(5,"rej123@gmail.com","Japan","Riju",1000);
  System.out.println("Before update the details is :");
	for(int i=0;i<5;i++) {
		s[i].display(i+1);
	}
	System.out.println("After update the details is :");

	MainStudent.stdNoFee(1, 1000);
	MainStudent.stdNoFee(5, 1000);

	

	
  }
}
