package es.cursojava.inicio.oo;

public class Colegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		 // Crear 3 alumnos
        Alumno alumno1 = new Alumno("Isabel", "12345678A", 4.8, new String[] {"Matemáticas", "BBDD"});
        Alumno alumno2 = new Alumno("Carlos Pérez", "87654321B", 6.5, new String[] {"Física", "Química"});
        Alumno alumno3 = new Alumno("María Torres", "11223344C", 8.0, new String[] {"Historia", "Geografía"});

        // Crear colegio con los 3 alumnos
        Alumno[] alumnos = {alumno1, alumno2, alumno3};
      
        estudiarAlumnos(alumnos);

	}
	public static void estudiarAlumnos(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            alumno.estudiar();
        }
    }

}
