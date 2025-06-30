package ch01;

public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        /*두값을 더하기*/
        int sum = n1 + n2;
        System.out.println(sum);
        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
        String result = s1 + age + "살 이에요";
//      반가워요 나의 나이는 20살 이에요
//      연결연산자
        System.out.println(result);

/*
        비교 연산자

        ">" 왼쪽이 크다
        "<" 왼쪽이 작다.
        ">=" 왼쪽이 크거나 같다.
        "<=" 왼쪽이 작거나 같다.
        "==" 둘이 같다
        "!=" 같지 않다.

        논리연산자

        "&&" And
        "||" OR
        "!" NOT
        비교판단 --if
        비교연산과 논리 연산의 결과는 항상 논리값이다.
*/
        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 != 2);
        System.out.println(trueOrFalse);

        trueOrFalse = (5 >= 2);
        System.out.println(trueOrFalse);

        int x = 9;
        trueOrFalse = (x >=1 && x <= 10);
        System.out.println(trueOrFalse);

        trueOrFalse = (x >=1 || x <= 10);
        System.out.println(trueOrFalse);

        System.out.println("------");
        String grade = "VIP";
        String myGrade = "VIP";
        trueOrFalse = (grade == myGrade);
        System.out.println(trueOrFalse);

        trueOrFalse = grade.equals(myGrade);
        System.out.println(trueOrFalse);
        Object obj = new Object();

        trueOrFalse  = grade.equals(obj);
        System.out.println(trueOrFalse);
    }
}
