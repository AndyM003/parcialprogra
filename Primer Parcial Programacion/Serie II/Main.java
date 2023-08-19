
package catedratico;

public class Main {

    public static void main(String[] args) {
        
        Catedratico catedratico1 = new Catedratico("Andy Muñoz", "15 calle", "78905657", "ingeniera en sistemas");
        Catedratico catedratico2 = new Catedratico("Brandon soto", "19 calle ", "69847382", "Programador");
        Catedratico catedratico3 = new Catedratico("Brian Lemus", "20 calle ", "43090804", "Analista");

        
        Curso curso1 = new Curso(30, "Programacion");
        Curso curso2 = new Curso(5, "Derecho");
        Curso curso3 = new Curso(5, "Fisica");

        
        Alumno alumno1 = new Alumno("Jose", "6av ", "53459856");
        Alumno alumno2 = new Alumno("Luis ", "13 calle", "6789498");
        Alumno alumno3 = new Alumno("Wilmer", "16 calle", "356786");

        
        Asignacion asignacion1 = new Asignacion(alumno1, 3);
        asignacion1.addCurso(curso1)
                ;
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        Asignacion asignacion2 = new Asignacion(alumno2, 3);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        Asignacion asignacion3 = new Asignacion(alumno3, 3);
        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso2);

        
        System.out.println("Informacion de los catedraticos:");
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        System.out.println("\nInformacion de los cursos:");
        System.out.println("Curso 1: " + curso1.getNombre());
        System.out.println("Curso 2: " + curso2.getNombre());
        System.out.println("Curso 3: " + curso3.getNombre());

        System.out.println("\nInformacion de los alumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();

        System.out.println("\nAsignaciones de cursos:");
        System.out.println("Asignacion 1:");
        imprimirAsignacion(asignacion1);
        System.out.println("Asignacion 2:");
        imprimirAsignacion(asignacion2);
        System.out.println("Asignacion 3:");
        imprimirAsignacion(asignacion3);
    }

    public static void imprimirAsignacion(Asignacion asignacion) {
        Alumno alumno = asignacion.getAlumno();
        System.out.println("Alumno: " + alumno.getNombre());
        Curso[] cursos = asignacion.getCursos();
        System.out.println("Cursos asignados:");
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("- " + curso.getNombre());
            }
        }
    }
}
