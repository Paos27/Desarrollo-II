package com.tarea1.ACMEMODA.controlador;

import org.springframework.web.bind.annotation.GetMapping;

public class CategoriaControlador {

	
	//categoria
			@GetMapping("/categoria")
			public String categoria() {
				return "/acmemoda/categoria"; //ruta fisica de la pagina
			}
}
