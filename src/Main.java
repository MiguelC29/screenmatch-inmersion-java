import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");
        // System.out.println("Película Matrix");

        // Declaración de variables
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Pelíula Retro que vale la pena ver");
        }

        // Ciclo FOR
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            // mediaEvaluacion = mediaEvaluacionUsuario + notaMatrix;
            mediaEvaluacionUsuario += notaMatrix;
        }
        System.out.println("La media de la película Matrix calculada por el usuario es: " + (mediaEvaluacionUsuario / 3));

        // Ciclo WHILE
        int iterador = 0;
        int cantidadDeCalificaciones;

        System.out.print("\nCuántas calificaciones desea ingresar: ");
        cantidadDeCalificaciones = teclado.nextInt();
        mediaEvaluacion = 0;

        while (iterador < cantidadDeCalificaciones) {
            System.out.print("Ingresa la calificación que le darías a Matrix: ");
            double calificacionMatrix = teclado.nextDouble();
            mediaEvaluacion += calificacionMatrix;
            iterador++;
        }
        System.out.println("La media de la película Matrix calculada por el usuario es: " + (mediaEvaluacion / cantidadDeCalificaciones));
    }
}