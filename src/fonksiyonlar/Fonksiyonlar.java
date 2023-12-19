package fonksiyonlar;

import java.util.Scanner;

public class Fonksiyonlar {
    public void FonksiyonHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int x = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int y = scan.nextInt();
        int result = 0;
        if (x > 0 && y < 0) {
            result = 2 * ((2 * x) + y + 2);
            System.out.println("f(x,y)" + result);
        }
        if (x > 0 && y == 0) {
            result = (2 * x) - y - 3;
            System.out.println("f(x,y)" + result);
        }
        if (x < 0 && y > 0) {
            result = (3 * x) + 4 * y + 3;
            System.out.println("f(x,y)" + result);
        }
    }
}
