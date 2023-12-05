//import fibonaccidongu.fibonacci;
import carpimtablosu.CarpimTablosu;
import harfnotu.HarfNotuSistemi;
import sayiortalamasi.SayiOrtalamasi;

import java.util.Scanner;
public class Main {

    public static void main(String [  ]  args) {
        //fibonacci fibonacci = new fibonacci();
        // Fibonacci : 1  1 ile başlıyor 1 1 2 3 5 8 13 21.....
        // a b c
        //     a b c
        //         a b c

      /* int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);

        for( int  i  = 0;   i<100  ;  i++){
            c = a + b;   //kaydırıyoruz çünkü bir sonrakiyle toplayacağız
            a = b;
            b = c;
            System.out.println(c);
        } */

        //FOR DONGUSU
      /*  int i = 0;

        for (int j = 0; j < 5;   m++) {
            System.out.println("i: " + i + ", m: " + m);
            i++;
        }
        for (int k = 0; k < 5; m++) {
                ++i;
                System.out.println("i: " + i + ", m: " + m);
        }*/

       /* System.out.println("Min value: "  +  Byte.MIN_VALUE + "Max value: "  + Byte.MAX_VALUE);      //byte
        System.out.println("Min value: "  +  Short.MIN_VALUE + "Max value: "  + Short.MAX_VALUE);  //short
        System.out.println("Min value: "  +   Integer.MIN_VALUE + "Max value: "  + Integer.MAX_VALUE);   //integer
        System.out.println("Min value: "  +   Long.MIN_VALUE + "Max value: "  +  Long.MAX_VALUE);  //long
        System.out.println("Min value: "  +   Float.MIN_VALUE + "Max value: "  +   Float.MAX_VALUE);   //float
        System.out.println("Min value: "  +   Double.MIN_VALUE + "Max value: "  +   Double.MAX_VALUE);   //double
        System.out.println("Min value: "  +   (int)  Character.MIN_VALUE + "Max value: "  +   (int)  Character.MAX_VALUE);    //character   Unicode                 tablosundaki karşılığı
        System.out.println("\nboolean:");     // boolean veri tipi  sadece true ve  false alır, min ve max değeri yoktur.  */


        // 3 sayının ortalaması


       /* SayiOrtalamasi sayiOrtalamasi = new SayiOrtalamasi();
        sayiOrtalamasi.sayiOrtalamasiHesapla();


        Scanner scan = new Scanner(System.in);
        // Vize ve Final notlarının ortalamasıyla 50 üstünü geçti mi?
        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fnal = scan.nextInt();

        double not = (vize * 0.4) + (fnal * 0.6); //not, not adındaki double türündeki değişkene atanıyor.

        System.out.println("Yıl sonu notunuz = " + not);

        if (not > 50) {
            System.out.println("Dersi geçtiniz.");
        } else if (not < 50) {
            System.out.println("Dersten kaldınız.");
        }
        //Eğer sadece if ve else kullanılsaydı, her iki durum da kontrol edilecek ve her iki durumun da sağlanması durumunda
        // her ikisi de çalıştırılacaktı. Ancak, else if kullanılarak, sadece bir durumun çalıştırılmasını sağlamak mümkün olur.




        System.out.println("alper");
        System.out.println("alper");
        System.out.println("alper");
        System.out.println("alper");
        System.out.println("alper");*/


//1 den 100e kadar toplam

       /* int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("sayıların toplamı=" + toplam);*/


//faktoriyel hesaplama

        /*int faktoriyel = 1;
        System.out.println("sayi giriniz: ");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!=" + faktoriyel);*/



        /*Scanner scan = new Scanner(System.in); //if-else
        HarfNotuSistemi harfNotu = new HarfNotuSistemi();
        harfNotu.HarfNotuHesapla();

        HarfNotuSistemi dersNotu = new HarfNotuSistemi(); //switch-case
        dersNotu.HarfNotuHesaplama();*/

        CarpimTablosu carpimTablo = new CarpimTablosu(); //carpim tablosu
        carpimTablo.CarpimTablosuOlustur();

    }
}