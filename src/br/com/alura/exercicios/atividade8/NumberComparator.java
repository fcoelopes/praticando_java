package br.com.alura.exercicios.atividade8;

public class NumberComparator {
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void compare() {
        if (number1 == number2) {
            System.out.println("Os números são iguais");
        } else if (number1 > number2) {
            System.out.println("O número " + number1 + " é maior que " + number2);
        } else if (number2 > number1) {
            System.out.println("O número " + number2 + " é maior que " + number1);
        }
    }
}
