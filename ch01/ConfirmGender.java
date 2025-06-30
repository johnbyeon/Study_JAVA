package ch01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConfirmGender {
    private static int inputInteger(BufferedReader bufferedReader) {
        //입력 데이터가 숫자가 아닌경우 다시 입력받도록 하는 메소드
        String str = "";
        int num = 0;

        try {
            num = Integer.parseInt(bufferedReader.readLine());  //정상적일경우 num에 데이터 입력
        } catch (IOException | NumberFormatException e) {    //에러 발생일 경우
            System.out.println("[System] 잘못된 입력입니다. 다시 입력하세요.");
            return inputInteger(bufferedReader);     //재귀함수(자기자신 다시 실행)
        }

        return num;
        //int값 반환
    }
    public static void main(String[] args) {
        /*주민번호 뒷자리 첫 숫자를 입력하세요.
        * 1또는3이면 :남자
        * 2또는4이면 :여자
        * 5이면: 외국인
        */

        System.out.println("✦⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯✦");
        System.out.println("⏐ 당신의 주민번호 뒷자리 첫 숫자를 입력하세요. ⏐");
        System.out.println("✦⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯✦");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int selectNum = inputInteger(br);

        if (selectNum == 1 || selectNum == 3){
            System.out.println("당신의 주민번호상의 성별은 남자입니다.");
        }else if(selectNum == 2 || selectNum == 4){
            System.out.println("당신의 주민번호상의 성별은 여자입니다.");
        }else if(selectNum == 5){
            System.out.println("You are a foreigner");
        }else {
            System.out.println("주민등록상 없는 숫자입니다.");
        }
    }
}
