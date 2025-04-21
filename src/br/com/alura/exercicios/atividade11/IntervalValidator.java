package br.com.alura.exercicios.atividade11;

public class IntervalValidator {
    private int lowerLimit;
    private int upperLimit;

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public boolean checkInterval(int number){
        boolean inLimit = false;
        if (number >= lowerLimit && number <= upperLimit){
            inLimit = true;
        } else {
            inLimit = false;
        }
        return inLimit;
    }
}
