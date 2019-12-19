package fr.ensim.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.ensim.tp5.model.AddressRepository;

@Controller
public class AdresseController {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/addresses")
	public String showAdresse(Model model) {
		model.addAttribute("allAddresses", addressRepository.findAll());
		return ("addresses");
	}
}
