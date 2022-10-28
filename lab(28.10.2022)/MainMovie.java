package com.Assignments;

public class Main_Movie {
  public static void main(String[] args) {
	  Movie obj = new Movie(9,12,150);
	  obj.setMovieName("RAGINI MMS");
	  System.out.println("The movie name is "+obj.getMovieName());
	  System.out.println("The movie start time "+obj.movieStartTime);
	  System.out.println("The movie end time "+obj.movieEndTime);
	  System.out.println("The movie ticket price= "+obj.movieTicketPrice); 
}
}
