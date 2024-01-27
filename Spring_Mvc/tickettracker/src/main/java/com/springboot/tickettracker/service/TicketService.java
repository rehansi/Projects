package com.springboot.tickettracker.service;

import java.util.List;

import com.springboot.tickettracker.model.Ticket;

public interface TicketService {

	List<Ticket> getAllTickets();

	Ticket getTicketById(Long id);

	Ticket saveTicket(Ticket ticket);

	void deleteTicket(Long id);

	Ticket updateticket(Ticket ticket);

	List<Ticket> searchTickets(String query);
}
