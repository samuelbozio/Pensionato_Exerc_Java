import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos quartos irão ser alugados? ");
        int n = sc.nextInt();
        Rent[] quartos = new Rent[10];


        for (int i=1; i<n; i++) {
            System.out.println("QUARTO" + i);
            System.out.println("Nome completo: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            System.out.println("Número do quarto: ");
            int numero = sc.nextInt();
            Rent rent = new Rent(nome, email);
            quartos[numero] = rent;


        }

        System.out.println("QUARTOS OCUPADOS:" );

        for (int i=0; i<10; i++) {

            if (quartos[i] != null) {

                System.out.println(i+":"+quartos[i]);

            }
        }




    }
}