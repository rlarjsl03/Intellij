package Week3_Prac;

import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        String[] choices = {"가위", "바위", "보"};

        Scanner stdin = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int Hum = stdin.nextInt();
        int Com = (int)(Math.random() * 3);
        System.out.println("사람: " + Hum + " 컴퓨터: " + Com);

        int result = (Hum - Com + 3) % 3;

        if (result == 0)
            System.out.print(" >비겼습니다!");
        else if (result == 1)
            System.out.print(" >사용자가 졌습니다!");
        else
            System.out.print(" >사용자가 이겼습니다!");
    }
}
