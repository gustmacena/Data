import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Data d = new Data();
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o dia:" );
            d.dia = leia.nextLine();

            System.out.println("Digite o mês: ");
            d.mes = leia.nextLine();

            System.out.println("Digite o ano: ");
            d.ano = leia.nextLine();
        }

        d.imprimeDados();


        
    }
}
