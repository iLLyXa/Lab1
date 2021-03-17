package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;


import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args) {
        //System.out.println("Hello java world\n");
        /*System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota"); */
        int a = 3;
        double b = 4.21;
        String s = "Dzien dobry";
        //System.out.print(leftPad(s, '+', 40));
        //System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);
        //System.out.println("Nazywalismy to \"witaminą B3\"");

        /*System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
        */
        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        for (int i = 1; i <= 64; i += i) {
            int result = (int) (Math.log(i) / Math.log(2));
            int sum = i + result;

            System.out.printf("%d\t%d\t%d\t\n", i, result, sum);
        }

        Scanner input = new Scanner(System.in);
        //int num1=0, num2=0;
        /*do {
            int num1=0, num2=0;
            System.out.print("Podaj liczbę, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania: %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);*/

//        int[] liczby = new int[30];
//        Random rnd = new Random();
//
//        for(int i = 0; i < 30; i++)
//            liczby[i] = rnd.nextInt();
//
//        int mx = Integer.MIN_VALUE;
//        int mn = Integer.MAX_VALUE;
//        long avg = 0;
//        for(int l : liczby)
//        {
//            System.out.println(1);
//            if (l < mn) mn = l;
//            if (l > mx) mx = l;
//            avg += l;
//        }
//        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn,mx,(float)avg/liczby.length);

        System.out.printf("%s%n", StringFun.anarhize("Hello mike"));
        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.translit("Богдан"));
        System.out.printf("%s%n",Account.translit("Ілля"));
        System.out.printf("%s%n",Account.translit("Артем"));
    }
}
