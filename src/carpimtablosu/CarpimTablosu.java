package carpimtablosu;

public class CarpimTablosu {
    public void CarpimTablosuOlustur() {

        int x = 1;
        int y = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int sayi1 = x + j;
                int sayi2 = y + i;
                int carpim = sayi1 * sayi2;
                System.out.println(sayi1 + "*" + sayi2 + "=" + carpim);
            }
            System.out.println();
        }
    }
}