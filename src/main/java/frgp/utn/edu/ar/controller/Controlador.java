package frgp.utn.edu.ar.controller;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import frgp.utn.edu.ar.Entidad.Persona;
import frgp.utn.edu.ar.webConfig.Conexion;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Controlador {
	Conexion conexion = new Conexion();
	JdbcTemplate template = new JdbcTemplate(conexion.Conectar());
	ModelAndView mav = new ModelAndView();
	List<?> datos;
	int id;
	
	@RequestMapping("redireccionar_registros.html")
	public ModelAndView Listar() {
		String sql = "select * from personas";
		datos = this.template.queryForList(sql);
		mav.addObject("lista",datos);
		mav.setViewName("Registros");
		return mav;
	}
	
	@RequestMapping(value = "Agregar.html", method = RequestMethod.POST)
	public ModelAndView Agregar(Persona persona) {
		String sql = "insert into personas(Nombre,Apellido,Correo,Nacionalidad) values(?,?,?,?)";
		this.template.update(sql,persona.getNombre(),persona.getApellido(),persona.getCorreo(),persona.getNacionalidad());
		return new ModelAndView("redirect:/redireccionar_registros.html");
	}
	@RequestMapping(value = "Agregar.html", method = RequestMethod.GET)
	public ModelAndView Agregar() {
		mav.addObject(new Persona());
		mav.setViewName("Agregar");
		return mav;
	}
	
	@RequestMapping(value = "Editar.html", method = RequestMethod.GET)
	public ModelAndView Editar(HttpServletRequest request) {
		id = Integer.parseInt(request.getParameter("id"));
		String sql = "select * from personas where Id="+id;
		datos = this.template.queryForList(sql);	
		mav.addObject("lista",datos);
		return new ModelAndView("redirect:/Editar.html");
	}
	
}
