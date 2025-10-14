package es.cursojava.mapas;

import es.cursojava.inicio.Colegio.Alumno;


public class AlumnoHeredado extends Alumno{

	private String curso;

	public AlumnoHeredado(String nombre, String dni, String curso)  {
		super(nombre, dni);
		this.curso = curso;
	    }

	    public String getCurso() {
	        return curso;
	    }

	    public void setCurso(String curso) {
	        this.curso = curso;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Curso: " + curso;
	    }
	}