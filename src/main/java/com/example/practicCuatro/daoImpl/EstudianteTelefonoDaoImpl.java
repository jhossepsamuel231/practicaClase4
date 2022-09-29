package com.example.practicCuatro.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.entity.EstudianteTelefono;

@Component
public class EstudianteTelefonoDaoImpl implements Todo<EstudianteTelefono>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<EstudianteTelefono> readAll() {
		String query = "SELECT PE.nombre, PE.telefono FROM persona AS PE WHERE PE.telefono=PE.telefono";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<EstudianteTelefono>(EstudianteTelefono.class));
	}

}
