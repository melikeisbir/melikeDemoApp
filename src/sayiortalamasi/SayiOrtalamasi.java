package sayiortalamasi;

import java.util.Scanner;

public class SayiOrtalamasi {

    public void sayiOrtalamasiHesapla(){
        Scanner scan = new Scanner(System.in); //Scanner sınıfından bir nesne oluşturuluyor. Bu nesne, kullanıcıdan girdi almak için kullanılacak
        int sayi, toplam = 0;  //Kullanıcının gireceği sayıları tutmak için sayi adında bir değişken ve bu sayıların toplamını tutmak için toplam
        // adında bir değişken tanımlanıyor. toplam değişkeni başlangıçta 0 olarak atanıyor.

        System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
        int adet = scan.nextInt();   //Kullanıcının girdiği sayı adedini adet değişkenine atayan satır.

        for(int i = 0; i < adet; i++)    //Bir döngü başlatılıyor. Bu döngü, kullanıcının gireceği sayıları belirtilen adet kadar almak için kullanılıyor. i değişkeni, döngüdeki iterasyonun sırasını temsil eder.
        {
            System.out.print((i + 1) + ". sayiyi giriniz: ");  //1'den başlayarak sıradaki sayının kaçıncı olduğunu belirtir.
            sayi = scan.nextInt();  //Kullanıcının girdiği sayıyı sayi değişkenine atayan satır.
            toplam += sayi;
        }
        System.out.println("Sayıların ortalaması = " + ((float)toplam / adet));
        //(float) ifadesi, bölme işlemi sonucu ondalık sayı elde etmek için kullanılır.
    }
}
