package harfnotu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HarfNotuSistemi {
    public void HarfNotuHesapla(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ders notunu giriniz: ");
        int dersnotu = scan.nextInt();


        if (dersnotu <50) {
            System.out.println("Harf Notu: FF");
        }
        else if (dersnotu <=59 ) {
            System.out.println("Harf Notu: CC");
        }
        else if(dersnotu <=69){
            System.out.println("Harf Notu: CB");
        }
        else if(dersnotu <=79){
            System.out.println("Harf Notu: BB");
        }
        else if(dersnotu <=90){
            System.out.println("Harf Notu: AB");
        }
        else if(dersnotu <=100) {
            System.out.println("Harf Notu: AA");
        }
    }


    public void HarfNotuHesaplama(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ders notunu giriniz:");
        int sayi = scan.nextInt();




        switch(sayi){
            case 1:
                System.out.println("FF" + (sayi < 50));
                break;
            case 2:
                System.out.println("CC" + (59));
                break;
            case 3:
                System.out.println("CB" + (69));
                break;
            case 4:
                System.out.println("BB" + (79));
                break;
            case 5:
                System.out.println("AB" + (90));
                break;
            case 6:
                System.out.println("AA" + (100));
                        break;
        }
    }
}
