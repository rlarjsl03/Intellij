package Week3_Prac;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("연산기호를 입력하세요: ");
        String input = stdin.nextLine();
        System.out.print("숫자 2개를 입력하세요: ");
        int n1 = stdin.nextInt();
        int n2 = stdin.nextInt();

        switch (input) {
            case "+":
                System.out.println(n1 + "+" + n2 + " = " + (n1 + n2));
                break;
            case "-":
                System.out.println(n1 + "-" + n2 + " = " + (n1 - n2));
                break;
            case "*":
                System.out.println(n1 + "*" + n2 + " = " + (n1 * n2));
                break;
            case "/":
                if (n2 == 0)
                    System.out.println("0으로 나눌 수 없습니다.");
                else
                    System.out.println((float)n1 + "/" + (float)n2 + " = " + (float)(n1 / n2));
                break;
        }
    }
}
