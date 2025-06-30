import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String str = scanner.next();
        System.out.printf(str + "님 당신의 성적을 입력하세요 : ");
        int score = scanner.nextInt();
        System.out.println(score >=60 ? "합격":"불합격");
        if (score >= 60) {
            System.out.println("축하합니다.");
            System.out.println(score - 60 + "점을 더 받았네요");
        } else {
            System.out.println("다음 기회에...");
            System.out.println(60 - score  + "점이 모자라네요");
        }




    }

}
