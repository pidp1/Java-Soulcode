import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual o seu nome? ");
        String nome = entrada.nextLine();

        System.out.println("qual a sua idade? ");
        int idade = entrada.nextInt();

        System.out.println("qual a sua altura?");
        double altura = entrada.nextDouble();

        System.out.println("qual o seu peso?");
        double peso = entrada.nextDouble();

        double imc=peso/Math.pow(altura,2);

        System.out.println("nome: " + nome + "idade: " + idade + "Altura: " + altura);
        System.out.println("este é o seu IMC: " + imc);
        System.out.printf("este é o seu IMC: %.2f", imc);

        if(imc < 17){
            System.out.println("Muito abaixo do peso");
        } else if(imc > 17 && imc <= 18.49){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso Normal");
        }else if(imc >= 25 && imc <= 29.99){
            System.out.println("Acima do peso");
        }else if(imc >= 30 && imc <= 34.99){
            System.out.println("Obesidade I");
        }else if(imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II (Severa)");
        }else {
            System.out.println("Obesidade III(Mórbida");
        }




        //switch-case
        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - Agua");
        System.out.println("1 - Fruta");
        System.out.println("1 - Batata");
        int dieta = entrada.nextInt();

        //escolha
        switch(dieta){
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break; //impedir de testar as condições abaixo
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default: // "else"
                System.out.println("Esta dieta não existe");
        }
        //laço de repetição

        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimento = entrada.nextInt();

        for(int i = 0; i < totalAlimento; i++){
            String alimento = entrada.nextLine();


        }

        int i = 0;
        while( i < totalAlimento){
            System.out.println(i);
            i++;
        }
    }
}
