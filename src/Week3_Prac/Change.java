package Week3_Prac;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("받을 돈 : ");
        int moneyNum = money.nextInt();
        System.out.print("상품 가격 : ");
        int moneyNum2 = money.nextInt();
        System.out.println("부가세 : " + (moneyNum2 / 10));
        System.out.println("잔돈 : " + (moneyNum - moneyNum2));
    }
}
