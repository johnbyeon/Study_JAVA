package ch01;

import java.util.Scanner;

public class TernaryOpr {
    public static void main(String[] args) {
        int n1 = 5;
        // 조건 비교 ?  참일때: 거짓일떄;
        String result; //두수를 비교한 결과를
        result = n1 > 10 ? "큰 값" : "작은 값";
        System.out.println(result);

        /*score 변수 생성 : 시험점수가 70
        점수가 60 이상이면 pass,아니면 Fail을 출력하도록 하세요*/
        Scanner sc = new Scanner(System.in);

        int score = 59;
        result = score >= 60 ? "Pass" : "Fail";
        System.out.println(result);
    }
}
