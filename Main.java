import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>PROGRAMA PRA ACHAR NUMEROS PRIMOS<<");
        System.out.println("Digite 2 numeros :");
        //
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Voce digitou : " + a + " e " + b);
        //
        EncontradorDePrimos encontrador = new EncontradorDePrimos();
        int numerosPrimos[] = encontrador.encontraPrimos(a, b);
        //
        System.out.println("Os numeros encontrados foram:");
        for(int numero : numerosPrimos){
            System.out.println(numero);

        }
    }
}
