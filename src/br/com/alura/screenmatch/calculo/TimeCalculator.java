package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void includes(Title titulo){
        this.totalTime += titulo.getDurationInMinutes();
    }

}
