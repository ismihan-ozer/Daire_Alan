import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        double angle, r, pi=3.14, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını Giriniz: ");
        r = input.nextDouble();

        System.out.print("Daire merkez açısı: ");
        angle = input.nextDouble();
        area = (pi * r * r * angle)/360;

        System.out.println("Daire alanı: " + area);

    }
}