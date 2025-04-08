package Week3_Prac;

import java.util.Scanner;

public class MoneySpliter {
    public static void main(String[] args) {
        int M10000 = 0;
        int M1000 = 0;
        int M500 = 0;
        int M100 = 0;
        int M10 = 0;
        int M1 = 0;

        Scanner stdin = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int moneyNum = stdin.nextInt();
        while (true){
            if (moneyNum >= 10000) {
                moneyNum -= 10000;
                M10000++;
            }else if (moneyNum >= 1000) {
                moneyNum -= 1000;
                M1000++;
            }else if (moneyNum >= 500) {
                moneyNum -= 500;
                M500++;
            }else if (moneyNum >=100) {
                moneyNum -= 100;
                M100++;
            }else if (moneyNum >= 10) {
                moneyNum -= 10;
                M10++;
            }else if (moneyNum >= 1) {
                moneyNum -= 1;
                M1++;
            }else
                break;
        }
        System.out.println("일만원권 : " + M10000);
        System.out.println("천원권 : " + M1000);
        System.out.println("오백원주화 : " + M500);
        System.out.println("백원주화 : " + M100);
        System.out.println("십원주화 : " + M10);
        System.out.println("일원주화 : " + M1);
    }
}
