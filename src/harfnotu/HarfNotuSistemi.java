package harfnotu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HarfNotuSistemi {
    public void HarfNotuHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ders notunu giriniz: ");
        int dersnotu = scan.nextInt();


        if (dersnotu < 50) {
            System.out.println("Harf Notu: FF");
        } else if (dersnotu <= 59) {
            System.out.println("Harf Notu: CC");
        } else if (dersnotu <= 69) {
            System.out.println("Harf Notu: CB");
        } else if (dersnotu <= 79) {
            System.out.println("Harf Notu: BB");
        } else if (dersnotu <= 90) {
            System.out.println("Harf Notu: AB");
        } else if (dersnotu <= 100) {
            System.out.println("Harf Notu: AA");
        }
    }


    public void HarfNotuHesaplama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ders notunu giriniz:");
        int sayi = scan.nextInt();


        switch (sayi / 10) {
            case 10:
                System.out.println("AA");
                break;
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("AB");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("BC");
                break;
            case 5:
                System.out.println("CC");
                break;
            default:
                System.out.println("FF");
        }
    }
}
