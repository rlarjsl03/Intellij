package Week3_Prac;

import java.util.Scanner;

public class Temper {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("==========================\n1. 화씨 -> 섭씨");
        System.out.println("2. 섭씨 -> 화씨\n==========================");

        System.out.print("번호를 선택하시오: ");
        int Select = stdin.nextInt();
        if (Select == 1) {
            System.out.print("온도를 입력하시오: ");
            float F = stdin.nextInt();
            float C = (F-32) * 5/9;
            System.out.print("변환된 온도는 " + C);
        }else if (Select == 2) {
            System.out.print("온도를 입력하시오: ");
            float C = stdin.nextInt();
            float F = (C / 5 * 9) + 32;
            System.out.print("변환된 온도는 " + F);
        }else
            System.out.println("1번과 2번 중에 선택하여 주세요.");
    }
}