package frgp.utn.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginaController {

	@RequestMapping("redireccionar_pagina2.html")
	public ModelAndView eventoRedireccionarPagi2(String txtNombre,Integer txtEdad){
		ModelAndView mv = new ModelAndView();
		mv.addObject("nombre", txtNombre);
		mv.addObject("edad", txtEdad);
		mv.setViewName("Pagina2");
		return mv;
	}
	@RequestMapping("redireccionar_pagina1.html")
	public ModelAndView eventoRedireccionarPagi1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Pagina1");
		return mv;
	}
}
