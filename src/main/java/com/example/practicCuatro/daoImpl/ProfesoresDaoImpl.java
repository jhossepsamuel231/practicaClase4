package com.example.practicCuatro.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.entity.Profesores;

@Component
public class ProfesoresDaoImpl implements Todo<Profesores>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Profesores> readAll() {
		String query = "SELECT PER.nombre, DEPA.departamento FROM profesor AS PROFE INNER JOIN persona AS PER ON PER.id=PROFE.id_profesor INNER JOIN departamento AS DEPA ON PROFE.id_departamento=DEPA.id ORDER BY DEPA.departamento";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Profesores>(Profesores.class));
	}

}
