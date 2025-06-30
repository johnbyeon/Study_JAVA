package ch02;

public class ForEx01 {
    public static void main(String[] args) {
        int sum = 0;
        //1부터 5까지 더해서 출력하는 프로그램
        for (int i = 1; i <= 5; i++) {
            System.out.println(sum + "+"+ i + "=" +(sum+i) );
            sum = sum+i;
        }
    }
}
