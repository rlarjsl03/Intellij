package Week3_Prac;

import java.util.Scanner;

public class WeekDivider {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("요일을 입력하세요: ");
        String day = stdin.nextLine();
        switch (day) {
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                System.out.println("주중");
                break;
            case "Sat":
            case "Sun":
                System.out.println("주말");
                break;
        }

    }
}
