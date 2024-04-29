package br.com.alura.screenmatch.calculo;

public class Recomendation {

    public void filter(Sortable sortable){
        if(sortable.getClassfication() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if (sortable.getClassfication() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
