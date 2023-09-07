package com.booking;
public class Teater {
	private String theater_name;
	private int no_of_seats;
	private Ticket ticket;
	
	///has a relationship
	//constructor
	

	public Teater(String theater_name, int no_of_seats) {
		this.theater_name = theater_name;
		this.no_of_seats = no_of_seats;
	}
	
	
	public String getTheater_name() {
		return theater_name;
	}


	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}



	public int getNo_of_seats() {
		return no_of_seats;
	}



	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}



	public Ticket getTicket() {
		return ticket;
	}



	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}



	public int printBookTicket() {
		if(ticket.getNo_of_ticket()<=no_of_seats) {
			no_of_seats=no_of_seats-ticket.getNo_of_ticket();
			return ticket.getNo_of_ticket();
		}else {
			return -1;
		}
	}
	
	public int ShowSeatsAvailability() {
		return no_of_seats;
	}
	
	public void cancelTicket(int cancel_Ticket) {
		if(cancel_Ticket<=ticket.getNo_of_ticket()) {
			no_of_seats=no_of_seats+cancel_Ticket;
			ticket.setNo_of_ticket(ticket.getNo_of_ticket()-cancel_Ticket);
		}else {
			System.out.println("======Technical Issue=======");
		}
	} 

}