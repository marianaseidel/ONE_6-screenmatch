public class Movie {

    String name;
    int yearOfRelease;
    boolean includingPlan;
    private double sumReview;
    private int totalReview;
    int durationInMinutes;

    //get -> para pegar algum valor
    int getTotalReview(){
        return totalReview;
    }

    // void é um método que vai apenas registrar algo
    void showsTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
    }

    void review(double note){
        sumReview += note;
        totalReview++;
    }

    double mediaReview(){
        return sumReview/totalReview;
    }
}
