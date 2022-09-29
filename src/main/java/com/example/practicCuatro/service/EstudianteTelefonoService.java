package com.example.practicCuatro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.daoImpl.EstudianteTelefonoDaoImpl;
import com.example.practicCuatro.entity.EstudianteTelefono;

@Service
public class EstudianteTelefonoService implements Todo<EstudianteTelefono>{

	@Autowired
	private EstudianteTelefonoDaoImpl daoImpl;
	
	@Override
	public List<EstudianteTelefono> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
