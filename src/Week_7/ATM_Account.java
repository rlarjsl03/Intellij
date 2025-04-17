package Week_7;


import java.util.Scanner;

class Account {
    private final int pin = 1234;
    private int balance = 0;

    public boolean Pin(int x) {
        if (pin == x)
            return true;
        else {
            System.out.println("PIN이 잘못되었습니다.");
            return false;
        }
    }
    public int Deposit (int x) {
        balance += x;
        return balance;
    }
    public int Withdraw(int x) {
        if (balance < x) {
            System.out.println("잔액이 부족합니다.");
            return 0;
        }else
            balance -= x;
        return balance;
    }
    public String tostring() {
        return "한재 잔액은 " + balance + "입니다.";
    }
}

public class ATM_Account {
    public static void main(String[] args) {
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            System.out.print("PIN을 입력하시오: ");
            int b = sc.nextInt();
            correct = a.Pin(b);
        }
        while (true) {
            System.out.println("1. 현금 입금");
            System.out.println("2. 현금 인출");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            System.out.print("번호를 선택하세요: ");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.print("입금액: ");
                int x = sc.nextInt();
                a.Deposit(x);
                System.out.println(a.tostring() + "\n");

            } else if (b == 2) {
                System.out.print("인출액: ");
                int x = sc.nextInt();
                a.Withdraw(x);
                System.out.println(a.tostring() + "\n");
            } else if (b == 3) {
                System.out.println(a.tostring() + "\n");
            } else if (b == 4) {
                System.out.println("종료합니다.");
                return;
            } else
                System.out.println("1~4번 중에 숫자를 골라주세요.");
        }
    }
}
