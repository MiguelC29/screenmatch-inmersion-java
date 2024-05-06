package modelo;

import java.util.Scanner;

public class Titulo {
    private String nombre, sinopsis;
    private int fechaDeLanzamiento, tiempoDeDuracionEnMinutos;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    // Para nombrar los metodos se usa el verbo en infinitivo o imperativo, actualmente en el mercado domina como imperativo
    public void muestraFichaTecnica() {
        System.out.println("\n****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + getNombre());
        System.out.println("Fecha de Lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");
        System.out.println("Sinopsis: " + getSinopsis());
    }

    public void solicitaDatos(Titulo titulo) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        setNombre(teclado.nextLine());

        System.out.println("Ingrese el año de lanzamiento");
        setFechaDeLanzamiento(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Ingrese una sinopsis");
        setSinopsis(teclado.nextLine());
    }
}
