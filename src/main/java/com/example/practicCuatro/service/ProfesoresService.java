package com.example.practicCuatro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.daoImpl.ProfesoresDaoImpl;
import com.example.practicCuatro.entity.Profesores;

@Service
public class ProfesoresService implements Todo<Profesores>{

	@Autowired
	private ProfesoresDaoImpl daoImpl;
	
	@Override
	public List<Profesores> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
