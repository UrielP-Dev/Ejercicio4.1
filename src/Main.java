import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en dólares: ");
        int cantidad = scanner.nextInt();

        int cien = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0, uno = 0;

        cambio(cantidad, cien, cincuenta, veinte, diez, cinco, uno);


    }

    public static void cambio(int cantidad, int cien, int cincuenta, int veinte, int diez, int cinco, int uno) {
        cien = cantidad / 100;
        cantidad %= 100;

        cincuenta = cantidad / 50;
        cantidad %= 50;

        veinte = cantidad / 20;
        cantidad %= 20;

        diez = cantidad / 10;
        cantidad %= 10;

        cinco = cantidad / 5;
        cantidad %= 5;

        uno = cantidad;
        System.out.println("Cambio en billetes:");
        System.out.println("Cien: " + cien);
        System.out.println("Cincuenta: " + cincuenta);
        System.out.println("Veinte: " + veinte);
        System.out.println("Diez: " + diez);
        System.out.println("Cinco: " + cinco);
        System.out.println("Uno: " + uno);
    }
}