package br.com.alura.exercicios.atividade10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayValidator {
    private boolean theDayIsWorkingDay;

    public boolean isValidDay(String day) {
        String regex = "^(segunda|terça|quarta|quinta|sexta|sábado|domingo)$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(day);
        return matcher.matches();
    }

    public boolean isWorkingDay(String day) {
        switch (day.toLowerCase()){
            case "segunda":
                theDayIsWorkingDay = true;
                break;
            case "terça":
                theDayIsWorkingDay = true;
                break;
            case "quarta":
                theDayIsWorkingDay = true;
                break;
            case "quinta":
                theDayIsWorkingDay = true;
                break;
            case "sexta":
                theDayIsWorkingDay = true;
                break;
            case "sábado", "domingo":
                theDayIsWorkingDay = false;
                break;
            default:
                System.out.println("Informe um dia da semana!");
                break;
        }
        return theDayIsWorkingDay;
    }
}
