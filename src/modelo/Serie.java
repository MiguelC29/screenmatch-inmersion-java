package modelo;

import java.util.Scanner;

public class Serie extends Titulo {
    private int temporadas, episodiosPorTemporada, duracionEnMinutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    @Override
    public void muestraFichaTecnica() {
        super.muestraFichaTecnica();
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episodios por Temporada: " + getEpisodiosPorTemporada());
        System.out.println("Duración por Episodio: " + getDuracionEnMinutosPorEpisodio() + " minutos");
    }

    @Override
    public void solicitaDatos(Titulo titulo) {
        Scanner teclado = new Scanner(System.in);

        super.solicitaDatos(titulo);
        System.out.println("Por favor ingresa el número de temporadas para esta serie");
        setTemporadas(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
        setEpisodiosPorTemporada(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Por favor ingresa la duración en minutos de cada episodio");
        setDuracionEnMinutosPorEpisodio(teclado.nextInt());
        teclado.nextLine();
    }
}