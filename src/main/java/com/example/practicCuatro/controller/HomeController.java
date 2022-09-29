package com.example.practicCuatro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practicCuatro.entity.AlumnosMatriculados;
import com.example.practicCuatro.entity.EstudianteTelefono;
import com.example.practicCuatro.entity.MatriculaAnio;
import com.example.practicCuatro.entity.Profesores;
import com.example.practicCuatro.service.AlumnoMatriculadoService;
import com.example.practicCuatro.service.EstudianteTelefonoService;
import com.example.practicCuatro.service.MatriculaAnioService;
import com.example.practicCuatro.service.ProfesoresService;

@RestController
@RequestMapping("/api/home/")
public class HomeController {
	
	@Autowired
	private AlumnoMatriculadoService alumnoService;
	@Autowired
	private MatriculaAnioService anioInicoService;
	@Autowired
	private ProfesoresService profeService;
	@Autowired
	private EstudianteTelefonoService esttelefonoService;
	
	@GetMapping("/primeraApi")
	public List<AlumnosMatriculados> primeraApi(){
		return alumnoService.readAll();
	}
	
	@GetMapping("/segundaApi")
	public List<MatriculaAnio> segundaApi(){
		return anioInicoService.readAll();
	}
	
	@GetMapping("/tercerApi")
	public List<Profesores> tercerApi(){
		return profeService.readAll();
	}
	
	@GetMapping("/cuartApi")
	public List<EstudianteTelefono> cuartApi(){
		return esttelefonoService.readAll();
	}
}
