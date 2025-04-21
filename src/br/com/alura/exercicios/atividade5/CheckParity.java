package br.com.alura.exercicios.atividade5;

public class CheckParity {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public void checkParity() {
        if (i % 2 == 0) {
            System.out.println("O número " + i + " é par.");
        } else {
            System.out.println("O número " + i + " é impar.");
        }
    }
}
