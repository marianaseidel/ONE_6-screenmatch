package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Sortable;

public class Movie extends Title implements Sortable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassfication() {
        return (int) mediaReview()/2;
    }
}
