package com.arquitecturajava.cliente2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HolaController {

	@Autowired
	RestTemplate plantilla;
	
	@GetMapping("/hola2")
	public String hola2() {
		
		ResponseEntity<String> respuesta= plantilla.getForEntity("http://cliente1/hola", String.class);
		return respuesta.getBody().toUpperCase();
	}
}
