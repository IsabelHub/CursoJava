package es.cursojava.inicio.oo;
/*
 * crear alumno con atributos:
 * nombre, dni, notaMedia,asignaturas
 * metodos: estudiar() "El estudiante" + nombre +"tiene las asignatras: " +asignaturas + "Y si su nota media es menor que 5" + motaMedia +" ha estudado poco,
 * */


public class Alumno {
	// Atributos
    private String nombre;
    private String dni;
    private double notaMedia;
    private String[] asignaturas;
    
    public Alumno(String nombre, String dni, double notaMedia, String[] asignaturas) {
        this.nombre = nombre;
        this.dni = dni;
        this.notaMedia = notaMedia;
        this.asignaturas = asignaturas;
    }

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
    
    public double estudiar(){
    	 System.out.print("El estudiante " + nombre + " tiene las asignaturas: ");

         for (int i = 0; i < asignaturas.length; i++) {
             System.out.print(asignaturas[i]);
             if (i < asignaturas.length - 1) {
                 System.out.print(", ");
             }
         }

         System.out.println();

         if (notaMedia < 5) {
             System.out.println("Y como su nota media es " + notaMedia + ", ha estudiado poco.");
         } else {
             System.out.println("Y como su nota media es " + notaMedia + ", ha estudiado bien.");
         }
    	return notaMedia;
    }

}
