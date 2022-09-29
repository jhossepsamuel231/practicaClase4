package com.example.practicCuatro.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.practicCuatro.dao.Todo;
import com.example.practicCuatro.entity.AlumnosMatriculados;

@Component
public class AlumnoMatriculadoDaoImpl implements Todo<AlumnosMatriculados>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<AlumnosMatriculados> readAll() {
		String query = "SELECT PER.nombre, GRA.grado, ASI.asignatura, PER.sexo FROM persona AS PER INNER JOIN alumno_se_matricula_asignatura AS AlumMat ON PER.id=AlumMat.id_alumno INNER JOIN asignatura AS ASI ON AlumMat.id_asignatura=ASI.id INNER JOIN grado AS GRA ON ASI.id_grado=GRA.id";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<AlumnosMatriculados>(AlumnosMatriculados.class));
	}

}
