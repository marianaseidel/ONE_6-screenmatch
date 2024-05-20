package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.Recomendation;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Titanic", 1997);
        myMovie.setDurationInMinutes(194);

        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.setDurationInMinutes(180);

        myMovie.showsTechnicalSheet();
        myMovie.review(8);
        myMovie.review(5);
        myMovie.review(10);
        System.out.println(myMovie.mediaReview());

        Serie lost = new Serie("Lost", 2000);
        lost.setSeasons(10);
        lost.setEpisodesBySeasons(10);
        lost.setDurationInMinutes(50);


        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(otherMovie);
        System.out.println(calculator.getTotalTime());

        Recomendation filterRecomendation = new Recomendation();
        filterRecomendation.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalVisualization(300);
        filterRecomendation.filter(episode);

        var pauloMovie = new Movie("Dogville", 2003);
        pauloMovie.setDurationInMinutes(200);
        pauloMovie.review(10);

        ArrayList<Movie> listOfMovies = new ArrayList<>();
        listOfMovies.add(pauloMovie);
        listOfMovies.add(myMovie);
        listOfMovies.add(otherMovie);

        System.out.println("Tamanho de lista: " + listOfMovies.size());
        System.out.println("Primeiro filme da lista: " + listOfMovies.get(0).getName());
        System.out.println(listOfMovies.toString());

    }
}
