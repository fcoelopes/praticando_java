package br.com.alura.exercicios.atividade7;

public class CheckPassword {
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void checkPassword(String p) {
        if (p.equals(password)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
