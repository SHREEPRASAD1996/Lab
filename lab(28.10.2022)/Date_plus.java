package com.java;
import java.time.*;
public class Date_plus {
   public static void main(String[] args)
    {
     LocalDate today = LocalDate.now(); 
     System.out.println("\nCurrent Date: "+today);   // it will print current date 
     System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
   }
}
