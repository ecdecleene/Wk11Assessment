package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Event;
import dmacc.repository.EventRepo;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 24, 2024  
*/
@Controller
public class EventController {
	@Autowired
	EventRepo repo;
	
	@GetMapping({"/", "viewEvents"})
	public String viewEvents(Model model) {
		if(repo.findAll().isEmpty()) {
			return addEvent(model);
		}
		
		model.addAttribute("events", repo.findAll());
		return "results";
	}
	
	@GetMapping("/addEvent")
	public String addEvent(Model model) {
		Event e = new Event();
		model.addAttribute("newEvent", e);
		return "add";
	}
	
	@PostMapping("/addEvent")
	public String addEvent(@ModelAttribute Event e, Model model) {
		repo.save(e);
		return viewEvents(model);
	}
	
	@PostMapping("/update/{id}")
	public String reviseEvent(Event e, Model model) {
		repo.save(e);
		return viewEvents(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateEvent(@PathVariable("id") long id, Model model) {
		Event e = repo.findById(id).orElse(null);
		System.out.println("EVENT TO EDIT: " + e.toString());
		model.addAttribute("newEvent", e);
		return "add";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEvent(@PathVariable("id") long id, Model model) {
		Event e = repo.findById(id).orElse(null);
		repo.delete(e);
		return viewEvents(model);
	}
}
