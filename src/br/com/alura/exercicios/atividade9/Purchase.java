package br.com.alura.exercicios.atividade9;

public class Purchase {
    private double discountPercentage;

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void calculateFinalPrice(double amount) {
        double discount;
        if (amount >= 100) {
            System.out.println("Desconto de 10% aplicado.");
            discount = amount * (discountPercentage / 100);
            amount -= discount;
            System.out.println("Valor da compra: R$ " + amount);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor da compra: R$ " + amount);
        }
    }
}