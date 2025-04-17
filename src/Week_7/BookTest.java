package Week_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Book {
    ArrayList<String[]> lists = new ArrayList<String[]>();
    String title;
    String rate;
    public void Registor(String title, String rate) {
        String[] book = new String[2];
        this.title = title;
        this.rate = rate;
        book[0] = title;
        book[1] = rate;
        lists.add(book);

    }
    public String Find(String x) {
        for (String[] list : lists) {
            if (x.equals(list[0])) {
                return "Book [title = " + list[0] + ", rate = " + list[1] + "]";
            }
        }
        return "책을 찾을 수 없습니다.";
    }
    public void Print() {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(Arrays.toString(lists.get(i)));
        }
    }
}

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> lists = new ArrayList<Book>();
        Book a = new Book();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==================================================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("==================================================");
            System.out.print("메뉴를 선택하시오: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("책 제목: ");
                String title = sc.next();
                System.out.print("책 평점: ");
                String rate = sc.next();
                a.Registor(title, rate);
            } else if (choice == 2) {
                System.out.print("책 제목: ");
                String title = sc.next();
                System.out.println(a.Find(title));
            } else if (choice == 3) {
                a.Print();
            } else if (choice == 4) {
                System.out.println("종료합니다.");
                break;
            } else
                System.out.println("1~4번 중에 선택해주세요.");
        }
    }
}
