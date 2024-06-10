import java.util.Scanner;

public class proje5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz :");

        double price, kdvPrice, total, rate = 18;
        price = input.nextDouble();

        kdvPrice = price * (rate / 100);
        total = price + kdvPrice;

        if (price > 1000) {
            rate = 8;
        } else {

        }

        System.out.println("Kdv Orani : %" + rate);
        System.out.println("Kdv Tutari :" + kdvPrice);
        System.out.println("Kdv'li Tutar :" + total);

    }
}
