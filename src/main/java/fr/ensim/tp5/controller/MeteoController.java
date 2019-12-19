package fr.ensim.tp5.controller;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp5.model.ResultatDarkSky;
import fr.ensim.tp5.model.ResultatRequeteAdresse;

@Controller
public class MeteoController {
	@PostMapping("/meteo")
	public String showMeteo(@RequestParam("in_adresse") String adresse, Model model) { // récupération du résultat du
																					// formulaire
		SimpleClientHttpRequestFactory httpRequest = new SimpleClientHttpRequestFactory();
		RestTemplate restTemplate = new RestTemplate(httpRequest);
		ResultatRequeteAdresse res = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + adresse,
				ResultatRequeteAdresse.class);
		System.out.println(adresse);
		double lon = res.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = res.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		ResultatDarkSky darkSky = restTemplate
				.getForObject("https://api.darksky.net/forecast/919b299c523ecf6f6991d173c20fe78d/" + lat + "," + lon
						+ "?lang=fr&units=si&exclude=daily,hourly,flags", ResultatDarkSky.class);
		model.addAttribute("meteo", darkSky);
		model.addAttribute("adresse", res.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville", res.getFeatures().get(0).getProperties().getCity());
		return ("meteo");
	}
}
