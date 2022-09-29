package com.example.practicCuatro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.daoImpl.AlumnoMatriculadoDaoImpl;
import com.example.practicCuatro.entity.AlumnosMatriculados;

@Service
public class AlumnoMatriculadoService implements Todo<AlumnosMatriculados>{

	@Autowired
	private AlumnoMatriculadoDaoImpl daoImpl;
	
	@Override
	public List<AlumnosMatriculados> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
