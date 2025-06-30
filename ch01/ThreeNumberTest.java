package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThreeNumberTest {
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
        /*수를 차례로 입력받아요
        * 가장 큰수와 가장 작은 수를 출력합니다
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("첫번째 숫자를 입력하세요 : ");
        int selectNum1 = inputInteger(br);
        System.out.println("두번째 숫자를 입력하세요 : ");
        int selectNum2 = inputInteger(br);
        System.out.println("세번째 숫자를 입력하세요 : ");
        int selectNum3 = inputInteger(br);

        int maxNum = selectNum1;
        int minNum = selectNum1;

        if(selectNum2 > maxNum){
            maxNum = selectNum2;
        }
        if(selectNum3 > maxNum){
            maxNum = selectNum3;
        }

        if(selectNum2 < minNum){
            minNum = selectNum2;
        }
        if(selectNum3 < minNum){
            minNum = selectNum3;
        }
        System.out.println("가장 큰 수 :" + maxNum + ",  가장 작은 수 : " + minNum);

    }
}
