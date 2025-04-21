package br.com.alura.exercicios.atividade14;

public class AcessValidator {
    private int acessKey;

    public void setAcessKey(int acessKey) {
        this.acessKey = acessKey;
    }

    public boolean checkAcess(int key, int permissionCode) {
        boolean getAcess = false;
        if (key == acessKey) {
            if(permissionCode == 1 || permissionCode == 2 || permissionCode == 3) {
                getAcess = true;
            }
        } else {
            getAcess = false;
        }
        return getAcess;
    }
}
