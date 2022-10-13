import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("primeiro valor: ");
        int num1 = entrada.nextInt();
        System.out.println("segundo valor: ");
        int num2 = entrada.nextInt();

        System.out.println("escolha um operador: ");
        System.out.println("Soma + ");
        System.out.println("Subtração - ");
        System.out.println("Multiplicação *");
        System.out.println("Divisão / ");

        String operador = entrada.nextLine();

        switch (operador) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
            default:
                System.out.println("tente novamente");

        }


    }
}
