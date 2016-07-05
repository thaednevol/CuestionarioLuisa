package com.atenea.datos;

import java.util.List;

import com.ateanea.entidades.CompetenciaEntidad;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CompetenciaDatos {

	public CompetenciaDatos(){
		super();
	}
	
	public List<CompetenciaEntidad> consultarCompetencias(){
		Statement cmd = con.createStatement();
	}
}
