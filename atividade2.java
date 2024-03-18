import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {

        int compra, pagamento, troco, trocoNotas, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, moeda1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o valor total da compra: ");
        compra = scanner.nextInt();

        System.out.println("\nDigite o valor pago: ");
        pagamento = scanner.nextInt();

        if (pagamento < compra) {
            System.out.println("\nO Valor pago é insuficiente para realizar a compra.");
        } else {

            troco = pagamento - compra;
            trocoNotas = pagamento - compra;

            while (trocoNotas >= 50) {
                nota50++;
                trocoNotas -= 50;
            }
            while (trocoNotas >= 20) {
                nota20++;
                trocoNotas -= 20;
            }
            while (trocoNotas >= 10) {
                nota10++;
                trocoNotas -= 10;
            }
            while (trocoNotas >= 5) {
                nota5++;
                trocoNotas -= 5;
            }
            while (trocoNotas >= 2) {
                nota2++;
                trocoNotas -= 2;
            }
            while (trocoNotas >= 1) {
                nota1++;
                trocoNotas -= 1;
            }
            System.out.println("\n \nO Valor da compra é de: R$" + compra);
            
            System.out.println("\nO valor pago foi de: R$" + pagamento);
            
            System.out.println("\nTroco: R$" + troco);
            
            System.out.println("\nNotas de R$ 50,00:" + nota50);
            
            System.out.println("\nNotas de R$ 20,00:" + nota20);
            
            System.out.println("\nNotas de R$ 10,00:" + nota10);
            
            System.out.println("\nNotas de R$ 5,00:" + nota5);
            
            System.out.println("\nNotas de R$ 2,00:" + nota2);
            
            System.out.println("\nNotas de R$ 1,00:" + nota1);
            scanner.close();

        }
    }
}