import java.util.Scanner;

public class atividade1 {
    public static void main (String[] args) {

        double number1, number2, number3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\"Digite o primeiro número: ");
        number1 = scanner.nextDouble();

        System.out.println("\"Digite o segundo número: ");
        number2 = scanner.nextDouble();

        System.out.println("\"Digite o terceiro número: ");
        number3 = scanner.nextDouble();

        media = (number1 + number2 + number3) / 3;

        if (number1 > number2 && number1 > number3) {
            System.out.println("\nO MAIOR número é: "+ number1);            
        }

        else if (number2 > number1 && number2 > number3) {
            System.out.println("\nO MAIOR número é: "+ number2);            
        }

        else {
            System.out.println("\nO MAIOR número é: "+ number3);            
        }

        if (number1 < number2 && number1 < number3) {
            System.out.println("\nO MENOR número é: "+ number1);            
        }

        else if (number2 < number1 && number2 < number3) {
            System.out.println("\nO MENOR número é: "+ number2);            
        }

        else {
            System.out.println("\nO MENOR número é: "+ number3);            
        }

        System.out.println("\nA média dos números é: "+ media);   
        scanner.close();

    }
}