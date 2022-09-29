package com.example.practicCuatro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.daoImpl.MatriculaAnioDaoImpl;
import com.example.practicCuatro.entity.MatriculaAnio;

@Service
public class MatriculaAnioService implements Todo<MatriculaAnio>{

	@Autowired
	private MatriculaAnioDaoImpl daoImpl;
	
	@Override
	public List<MatriculaAnio> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

}
