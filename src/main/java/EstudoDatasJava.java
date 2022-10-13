import java.time.LocalDate;

public class EstudoDatasJava {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal));
        System.out.println(hoje.isBefore(natal));

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println("--------------------------");

        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);

        System.out.println(diasParaNatal + " Dias para o Natal");


    }
}
