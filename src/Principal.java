import br.com.alura.screenmatch.calculo.Recomendation;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        myMovie.setName("Titanic");
        myMovie.setYearOfRelease(1997);
        myMovie.setDurationInMinutes(194);

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setYearOfRelease(2023);
        otherMovie.setDurationInMinutes(180);

        myMovie.showsTechnicalSheet();
        myMovie.review(8);
        myMovie.review(5);
        myMovie.review(10);
        System.out.println(myMovie.mediaReview());

        Serie lost = new Serie();

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

    }
}
