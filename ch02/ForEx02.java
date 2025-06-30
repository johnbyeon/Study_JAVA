package ch02;

public class ForEx02 {
    public static void main(String[] args) {
        //1부터 10 사이의 짝수의 합을 구합니다.
        int sum = 0;
        for (int i = 2; i <=10 ; i+=2) {
            System.out.printf("%d + %d = %d\n",sum, i, sum+i);
            sum += i;
        }
        System.out.println("최종 값 :"+sum);
        sum = 0;
        for(int i = 1;i <=10;i++){
            if(i % 2 ==0){
                System.out.printf("%d + %d = %d\n",sum, i, sum+i);
                sum += i;
            }
        }
        System.out.println("최종 값 :"+sum);

    }
}
