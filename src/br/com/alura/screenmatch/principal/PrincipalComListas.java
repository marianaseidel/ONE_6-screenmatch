package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Title;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Titanic", 1997);
        myMovie.review(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.review(6);
        Serie lost = new Serie("Lost", 2000);
        var pauloMovie = new Movie("Dogville", 2003);
        pauloMovie.review(10);

//      List<Title> list = new ArrayList<>(); // baseado em um array.
        List<Title> list = new LinkedList<>(); // baseado em uma lista encadeada.
        list.add(pauloMovie);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(lost);

        for (Title item: list) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClassfication() > 2) {
                System.out.println("Classificação: " + movie.getClassfication());
            }
        }

        Collections.sort(list); //ordena a lista por ordem alfabética.
        System.out.println("Lista ordenada por título:");
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getYearOfRelease)); //ordena a lista pelo ano de lançamento do filme.
        System.out.println("Lista ordenada por ano:");
        System.out.println(list);
    }
}
