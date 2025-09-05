package es.cursojava.inicio.strings;

public class PreguntaExamen {
    public static void main(String[] args) {
        String texto = null;

        if (texto != null && texto.startsWith("Hola")) {
            System.out.println("Empieza con 'Hola'");
        }

        if (texto != null & texto.startsWith("Hola")) {
            System.out.println("Empieza con 'Hola' usando &");
        }
    }
}

 
