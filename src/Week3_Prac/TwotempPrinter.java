package Week3_Prac;

import java.util.Scanner;

public class TwotempPrinter {
    public static void main(String[] args) {
        int twoTemp;
        String totalTwo = "";
        String temp ;

        Scanner stdin = new Scanner(System.in);
        System.out.print("정수 : ");
        int i = stdin.nextInt();
        int a = i;

        while (i > 0){
            twoTemp = i % 2;
            i /= 2;
            temp = Integer.toString(twoTemp);
            totalTwo = temp + totalTwo;
            //System.out.print(twoTemp + " ");
        }
        System.out.println(a + " : " + totalTwo);
    }
}