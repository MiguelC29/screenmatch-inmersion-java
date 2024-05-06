package modelo;

import java.util.Scanner;

public class Pelicula extends Titulo {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void muestraFichaTecnica() {
        super.muestraFichaTecnica();
        System.out.println("Director: " + getDirector());
    }

    @Override
    public void solicitaDatos(Titulo titulo) {
        Scanner teclado = new Scanner(System.in);

        super.solicitaDatos(titulo);
        System.out.println("Ingrese la duración en minutos");
        titulo.setTiempoDeDuracionEnMinutos(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Ingrese el director de la película");
        setDirector(teclado.nextLine());
    }
}