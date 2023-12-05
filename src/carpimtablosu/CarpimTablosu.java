package carpimtablosu;

public class CarpimTablosu {
    public void CarpimTablosuOlustur(){

        int carpim = 1;
        for (int i = 1; i < 10; i++) {
            carpim += i*carpim;
        }
        System.out.println("Sayıların Çarpımı=" + carpim);
    }
}
