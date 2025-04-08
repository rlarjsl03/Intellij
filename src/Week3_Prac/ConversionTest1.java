package Week3_Prac;

public class ConversionTest1 {
    public static void main(String[] args) {
        byte b;
        int i = 300;
        long j = 987654321L; // L 붙히기
        b = (byte) i; // byte형식으로 변환
        i = (int) j; // int형으로 변환
        System.out.println("b의 값 : " + b);
        System.out.println("i의 값 : " + i);
        System.out.println("j의 값 : " + j);
    }
}
