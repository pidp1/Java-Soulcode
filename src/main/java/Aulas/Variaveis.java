package Aulas;

public class Variaveis {
    //execução do nosso programa java
    public static void main(String[] args){
        System.out.println("hello world!"); // equivalente ao console.log no JS

        //variaveis no Java - fortemente tipados & estaticamente tipados
        int idade = 20; //int = inteiro
        double salario = 4500.99; //dupla precisão (casas decimais)
        float nota = 7.5f; //sufixo f para indicar o float
        long populacaoTerra = 7_000_000_000L;
        int i=1, j=0, k=1000;
        String nomeCompleto = "Pedro Imparato";

        int teste = 10;
        teste = 9; // reatribuição de variáveis

        final int teste2 = 9;
        //teste2 = 10;

        //operadores
        int a = 10;
        int b = 5;


        int soma = a + b;
        int subtracao = a-b;
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println("o resultado da soma é " + soma);

        // método Math
        double x = Math.sqrt(144);
        double y = Math.pow(5,2);


        //operadores 2

        int valor = 5;
        valor ++; // incremento + 1
        valor += 10; // decremento - 1

        //operadores relacionais

        boolean teste1 = (5 > 1); //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5 == 5; //true
        boolean teste5 = 6 >= 6; //true
        boolean teste7 = 5 <= 9;//true

        // operadores logicos

        boolean teste8 = true && false; //false // and
        boolean teste9 = true || false; // true // or
        boolean teste10 = !teste1;              // not






    }

}
