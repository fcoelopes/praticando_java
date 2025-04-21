package br.com.alura.exercicios.atividade6;

public class CheckApproval {
    private double passingGrade;
    private double failingGrade;

    public void setPassingGrade(double passingGrade) {
        this.passingGrade = passingGrade;
    }

    public void setFailingGrade(double failingGrade) {
        this.failingGrade = failingGrade;
    }

    public void check(double average) {
        if (average >= passingGrade) {
            System.out.println("O estudante teve média " + average + " e foi aprovado.");
        } else if (average < failingGrade) {
            System.out.println(("O estudante teve média " + average + " e foi reprovado."));
        } else {
            System.out.println(("O estudante teve média " + average + " e está de recuperação."));
        }
    }
}
