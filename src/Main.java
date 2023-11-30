//import fibonaccidongu.fibonacci;
public class Main {

    public static void main(String [  ]  args) {
       //fibonacci fibonacci = new fibonacci();
        // Fibonacci : 1  1 ile başlıyor 1 1 2 3 5 8 13 21.....
        // a b c
        //     a b c
        //         a b c

        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);

        for( int  i  = 0;   i<100  ;  i++)
        {
            c = a + b;   //kaydırıyoruz çünkü bir sonrakiyle toplayacağız
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}