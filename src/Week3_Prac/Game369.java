package Week3_Prac;

import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int num = stdin.nextInt();
        for (int i = 0; i <= num; i++) {
            int a = i / 10;
            int b = i % 10;
            int count = 0;
            if (a == 3 || a == 6 || a == 9)
                count++;
            if (b == 3 || b == 6 || b == 9)
                count++;
            if (count == 1)
                System.out.print("짝 ");
            else if (count == 2)
                System.out.print("짝짝 ");
            else
                System.out.print(i + " ");
        }
    }
}
