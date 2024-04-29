package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean includingPlan;
    private double sumReview;
    private int totalReview;
    private int durationInMinutes;

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
}
