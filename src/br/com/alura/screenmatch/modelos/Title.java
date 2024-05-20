package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErrorConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {

    private String name;
    private int yearOfRelease;
    private boolean includingPlan;
    private double sumReview;
    private int totalReview;
    private int durationInMinutes;

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if(myTitleOmdb.year().length() > 4) {
            throw new ErrorConversionException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.yearOfRelease = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0, 2));

    }

    //get -> para pegar algum valor privado
    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludingPlan() {
        return includingPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalReview(){
        return totalReview;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludingPlan(boolean includingPlan) {
        this.includingPlan = includingPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    // void é um método que vai apenas registrar algo
    public void showsTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    public void review(double note){
        sumReview += note;
        totalReview++;
    }

    public double mediaReview(){
        return sumReview/totalReview;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(Nome = " + name +
                ", Ano de Lançamento = " + yearOfRelease + "," +
                " Duração = " + durationInMinutes + ")";
    }
}
