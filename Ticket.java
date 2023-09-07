package com.booking;
public class Ticket {
	private String movie_name;
	private int no_of_ticket;
	
	//constructor
	
	public Ticket(String movie_name,int no_of_ticket) {
		this.movie_name=movie_name;
		this.no_of_ticket=no_of_ticket;
	}
	
	//public getters and setters
	
	
	//printing ticket method
	public void printTicketDatails() {
		System.out.println("============Ticket Datails============");
		System.out.println("Movie name is " + movie_name);
		System.out.println(no_of_ticket + " tickets are booked");
		System.out.println("======================================");
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getNo_of_ticket() {
		return no_of_ticket;
	}

	public void setNo_of_ticket(int no_of_ticket) {
		this.no_of_ticket = no_of_ticket;
	}
}