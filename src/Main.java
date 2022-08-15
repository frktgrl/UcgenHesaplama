import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double hipotenus,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Kısa Kenarı Giriniz:");
        a = input.nextInt();

        System.out.println("Uzun Kenarı Giriniz:");
        b = input.nextInt();

        hipotenus = Math.sqrt((a * a) + (b * b)) ;

        System.out.println("Hipotenus: " + hipotenus);

        u = (a+b+hipotenus)/2;
        System.out.println("Ücgen Cevresi:"+ 2*u);

        alan = u*(u-a)*(u-b)*(u-hipotenus);

        System.out.print("Ucgen Alanı:"+ alan);


    }
}
