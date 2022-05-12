import java.util.Scanner;

public class ucgen_hesap {
    public static void main(String[] args) {

        double a,b,c,cevre,alan,u;
        Scanner input = new Scanner(System.in);

        System.out.println("......Dikkat Program Sadece Dik Ucgen Icin Tasarlanmistir.......");
        System.out.println("Program sizden aldigi iki knear ile hipotenus, cevre ve alan hesabı yapmaktadir.");

        System.out.println("Ucgenin ilk kenarini giriniz : ");
        a= input.nextDouble();

        System.out.println("Ucgenin ikinci kenirini giriniz : ");
        b= input.nextDouble();

        c= Math.sqrt(a*a + b*b);

        cevre= a+b+c;
        u= cevre/2;

        alan= Math.sqrt( u* (u - a) * (u-b) * (u-c));

        System.out.println("Hipotenus : " + c);
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);








    }
}
