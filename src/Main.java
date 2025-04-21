import br.com.alura.exercicios.atividade14.AcessValidator;
import br.com.alura.exercicios.atividade5.CheckParity;
import br.com.alura.exercicios.atividade6.CheckApproval;
import br.com.alura.exercicios.atividade7.CheckPassword;
import br.com.alura.exercicios.atividade8.NumberComparator;
import br.com.alura.exercicios.atividade9.Purchase;
import br.com.alura.exercicios.atividade10.DayValidator;
import br.com.alura.exercicios.atividade11.IntervalValidator;
import br.com.alura.exercicios.atividade12.TriangleValidator;
import br.com.alura.exercicios.atividade13.BloodTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exercicio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solução dos exercícios do Curso Praticando Java: condicionais if e else da Alura");
        System.out.println("Selecione o exercício desejado: ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" 5 - Verificando se um número é par ou ímpar.");
        System.out.println(" 6 - Verificando aprovação em uma disciplina.");
        System.out.println(" 7 - Validação de senha.");
        System.out.println(" 8 - Comparando dois números.");
        System.out.println(" 9 - Verificação de desconto em compras.");
        System.out.println("10 - Verificação de dia útil.");
        System.out.println("11 - Verificando se um número está em um intervalo");
        System.out.println("12 - Verificação de triângulo");
        System.out.println("13 - Verificação de compatibilidade de doação de sangue");
        System.out.println("14 - Verificação de código de acesso e nível de permissão");
        System.out.println("Escolha o exercício: ");
        exercicio = scanner.nextInt();
        switch (exercicio){
            case 5:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                CheckParity teste = new CheckParity();
                teste.setI(8);
                teste.checkParity();
                teste.setI(7);
                teste.checkParity();
                break;
            case 6:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                CheckApproval checkApproval = new CheckApproval();
                checkApproval.setPassingGrade(7);
                checkApproval.setFailingGrade(5);
                checkApproval.check(8.2);
                checkApproval.check(5.8);
                checkApproval.check(4.3);
                break;
            case 7:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                String senha;
                CheckPassword checkPassword = new CheckPassword();
                checkPassword.setPassword("123456");
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();
                checkPassword.checkPassword(senha);
                break;
            case 8:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                int numero1;
                int numero2;
                NumberComparator numberComparator = new NumberComparator();
                System.out.println("Digite um número: ");
                numero1 = scanner.nextInt();
                numberComparator.setNumber1(numero1);
                System.out.println("Digite outro número: ");
                numero2 = scanner.nextInt();
                numberComparator.setNumber2(numero2);
                numberComparator.compare();
                break;
            case 9:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                double compra;
                Purchase purchase = new Purchase();
                purchase.setDiscountPercentage(10);
                System.out.println("Digite o valor da compra: ");
                compra = scanner.nextDouble();
                purchase.calculateFinalPrice(compra);
                break;
            case 10:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                String dia;
                DayValidator dayValidator = new DayValidator();
                System.out.println("Digite um dia da semana (sem o -feira quando existir)");
                dia = scanner.nextLine();
                if (dayValidator.isValidDay(dia)){
                    if (dayValidator.isWorkingDay(dia)) {
                        System.out.println(dia + " é um dia útil.");
                    } else {
                        System.out.println(dia + " não é um dia útil.");
                    }
                } else {
                    System.out.println("Informe um dia da semana (sem o -feira quando existir)");
                }
                break;
            case 11:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                int number;
                IntervalValidator intervalValidator = new IntervalValidator();
                intervalValidator.setLowerLimit(1000);
                intervalValidator.setUpperLimit(5000);
                System.out.println("Digite o valor do empréstimo: ");
                number = scanner.nextInt();
                if (intervalValidator.checkInterval(number)){
                    System.out.println("O valor " + number + ", está dentro do intervalo permitido para empréstimo.");
                } else {
                    System.out.println("O valor " + number + ", não está dentro do intervalo permitido para empréstimo.");
                }
                break;
            case 12:
                scanner.nextLine(); //O comando "scanner.nextInt" não consome o caractere /n.
                double side1, side2, side3;
                TriangleValidator triangleValidator = new TriangleValidator();
                System.out.println("Digite o primeiro lado: ");
                side1 = scanner.nextDouble();
                System.out.println("Digite o segundo lado: ");
                side2 = scanner.nextDouble();
                System.out.println("Digite o terceiro lado: ");
                side3 = scanner.nextDouble();
                if (triangleValidator.CheckTriangle(side1, side2, side3)){
                    System.out.println("Os lados podem formar um triângulo.");
                } else {
                    System.out.println("Os lados não formam um triângulo.");
                }

                break;
            case 13:
                scanner.nextLine();
                int age;
                double weight;
                BloodTest bloodTest = new BloodTest();
                bloodTest.setMinimumAge(18);
                bloodTest.setMaximumAge(65);
                bloodTest.setMinimumWeight(50);
                System.out.println("Digite a idade do doador: ");
                age = scanner.nextInt();
                System.out.println("Digite o peso do doador (em Kg): ");
                weight = scanner.nextDouble();
                bloodTest.bloodTestDonatorCompability(age, weight);
                break;
            case 14:
                scanner.nextLine();
                int acessKey;
                int permissionType;
                AcessValidator acessValidator = new AcessValidator();
                acessValidator.setAcessKey(2023);
                System.out.println("Digite o código de acesso: ");
                acessKey = scanner.nextInt();
                System.out.println("Digite o nível de permissão: ");
                permissionType = scanner.nextInt();
                if (acessValidator.checkAcess(acessKey, permissionType)){
                    System.out.println("Acesso permitido. Bem-vindo ao sistema!");
                } else {
                    System.out.println("Acesso negado.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
}