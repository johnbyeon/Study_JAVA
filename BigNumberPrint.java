import java.util.Scanner;

public class BigNumberPrint {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요 : ");
        int num1 = sc1.nextInt();
        System.out.println("두번째 수를 입력하세요 : ");
        int num2 = sc2.nextInt();
        int result = 0;
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        System.out.println("First : "+num1+", Second : " + num2);
        System.out.println("큰 수 : " + result);

        System.out.println("입력받은 두수를 바꾸어 출력합니다.");
        System.out.println("First : "+num1+", Second : " + num2);
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("First : "+num1+", Second : " + num2);

        System.out.println("성적을 입력하세요 : ");
        int score = sc1.nextInt();
        String grade ="";
        //성적처리

        if (score >= 90) {
            grade = "A";
        }else if(score >=80){
            grade = "B";
        }else if(score >=70){
            grade = "C";
        }else if(score >=60){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("당신의 학점은 : '" + grade + "' 입니다.");


    }
}
