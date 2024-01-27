package com.springboot.tickettracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.tickettracker.model.Ticket;
import com.springboot.tickettracker.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping("/homeservice")
	public String home(Model model) {
		List<Ticket> tickets = ticketService.getAllTickets();
		model.addAttribute("tickets", tickets);
		return "home";
	}

	@GetMapping("/create")
	public String createTicketForm(@ModelAttribute Ticket ticket) {
//		Ticket new_ticket = new Ticket();
//		model.addAttribute("ticket", new_ticket);
		return "create";
	}

	@PostMapping("/save")
	public String createTicket(@ModelAttribute Ticket ticket) {
		ticketService.saveTicket(ticket);
		return "redirect:/homeservice";
	}

	@GetMapping("/delete/{id}")
	public String deleteTicket(@PathVariable Long id) {
		ticketService.deleteTicket(id);
		return "redirect:/homeservice";
	}

	@GetMapping("/edit/{id}")
	public String editTicketForm(@PathVariable Long id, Model model) {
		Ticket ticket = ticketService.getTicketById(id);
		model.addAttribute("ticket", ticket);
		return "edit";
	}

	@PostMapping("/update/{id}")
	public String updateEmployeeForm(@PathVariable Long id, @ModelAttribute Ticket updatedTicket, Model model) {
		Ticket existingTicket = ticketService.getTicketById(id);
		existingTicket.setId(id);
		existingTicket.setTitle(updatedTicket.getTitle());
		existingTicket.setShortDescription(updatedTicket.getShortDescription());
		existingTicket.setCreatedDate(updatedTicket.getCreatedDate());

		ticketService.updateticket(existingTicket);

		return "redirect:/homeservice";
	}

	@GetMapping("/view/{id}")
	public String viewTicket(Model model) {
		List<Ticket> ticketlist = ticketService.getAllTickets();
		model.addAttribute("tickets", ticketlist);
		return "home";
	}

	@GetMapping("/search")
	public String searchTickets(@RequestParam String query, Model model) {
		List<Ticket> searchResults = ticketService.searchTickets(query);
		model.addAttribute("tickets", searchResults);
		return "home";
	}

}
