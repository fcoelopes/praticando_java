package br.com.alura.exercicios.atividade13;

public class BloodTest {
    private int minimumAge;
    private int maximumAge;
    private double minimumWeight;

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public void setMinimumWeight(double minimumWeight) {
        this.minimumWeight = minimumWeight;
    }

    public void bloodTestDonatorCompability(int age, double weight) {
        if (age < minimumAge) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        } else if (age > maximumAge) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        } else if (weight < minimumWeight) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar mais que 50 quilos.");
        } else {
            System.out.println("Doador compatível.");
        }
    }
}
