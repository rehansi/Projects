package com.springboot.tickettracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.tickettracker.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

	List<Ticket> findByTitleContainingOrShortDescriptionContaining(String title, String shortDescription);
}