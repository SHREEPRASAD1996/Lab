package com.java;
/*
 * question 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables
 */
public class Film {
  String movieName;
  int movieStartTime;
  int movieEndTime;
  double movieTicketPrice;
  Movie(int movieStartTime,int movieEndTime,double movieTicketPrice){
	  this.movieStartTime=movieStartTime;
	  this.movieEndTime=movieEndTime;
	  this.movieTicketPrice=movieTicketPrice;
  }
public String getMovieName() {   // we get movie name 
	return movieName;
}
public void setMovieName(String movieName) {  // here we set movie name 
	this.movieName = movieName;
}
public int getMovieStartTime() {
	return movieStartTime;
}
public void setMovieStartTime(int movieStartTime) {
	this.movieStartTime = movieStartTime;
}
public int getMovieEndTime() {
	return movieEndTime;
}
public void setMovieEndTime(int movieEndTime) {
	this.movieEndTime = movieEndTime;
}
public double getMovieTicketPrice() {
	return movieTicketPrice;
}
public void setMovieTicketPrice(double movieTicketPrice) {
	this.movieTicketPrice = movieTicketPrice;
}
}
