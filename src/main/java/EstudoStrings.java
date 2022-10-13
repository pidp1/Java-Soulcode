import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        String nome = "pedro";
        Scanner entrada = new Scanner(System.in);

        if (nome == "pedro"){
            System.out.println("São iguais");

        }
        System.out.println("Digite seu sobrenome: ");

        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("pereira") ){
            System.out.println("são iguais");

        } else {
            System.out.println("são diferentes!");

        }

        //exemplo
        System.out.println("digite um nome: ");
        String seuNome = entrada.nextLine();
        if (seuNome.toUpperCase().equals("JOSÉ")){
            System.out.println("SEU NOME É JOSÉ");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/");







    }
}
