package br.com.alura.exercicios.atividade12;

public class TriangleValidator {
    public boolean CheckTriangle(double side1, double side2, double side3) {
        boolean isTriangle;
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
            isTriangle = true;
        } else {
            isTriangle = false;
        }
        return isTriangle;
    }
}
