package com.example.practicCuatro.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.entity.MatriculaAnio;

@Component
public class MatriculaAnioDaoImpl implements Todo<MatriculaAnio>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MatriculaAnio> readAll() {
		String query = "SELECT PER.nombre, CE.anyo_inicio FROM curso_escolar AS CE INNER JOIN alumno_se_matricula_asignatura AS AlumMat ON AlumMat.id_curso_escolar=CE.id INNER JOIN persona AS PER ON AlumMat.id_alumno=PER.id ORDER BY CE.anyo_inicio";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<MatriculaAnio>(MatriculaAnio.class));
	}

}
