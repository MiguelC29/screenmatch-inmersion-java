import calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {

    // INSTANCIA DE OBJETOS
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            String menu = """
                    \nBienvenido(a) a Screenmatch
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    9) Salir
                    """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("**REGISTRAR PELÍCULA**");
                    peliculaUsuario.solicitaDatos(peliculaUsuario);
                    peliculaUsuario.muestraFichaTecnica();

                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    break;
                case 2:
                    System.out.println("**REGISTRAR SERIE**");
                    serieUsuario.solicitaDatos(serieUsuario);
                    serieUsuario.muestraFichaTecnica();

                    calculadoraDeTiempo.incluye(serieUsuario);
                    break;
                case 3:
                    System.out.println("Tiempo que necesitas para maratonar tus títulos favoritos " + calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}