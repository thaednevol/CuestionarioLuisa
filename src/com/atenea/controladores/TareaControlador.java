package com.atenea.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.ateanea.entidades.TareaEntidad;

@ViewScoped
@ManagedBean(name="tarea")
public class TareaControlador {
	
	private TareaEntidad tarea;

	public TareaEntidad getTarea() {
		return tarea;
	}

	public void setTarea(TareaEntidad tarea) {
		this.tarea = tarea;
	}
	
	

}
