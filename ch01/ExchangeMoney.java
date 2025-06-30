package ch01;

public class ExchangeMoney {

    /*2680원을 1_000원, 500원, 100원, 50원, 10원*/
    /*각각 몇 개씩 최소로 필요한지 출력하세요*/
    /*금액 : 2680원
    1000원 : 2개
    500원 : 1개
    100원 : 1개
    50원 : 1개
    10원 : 3개
    */
    public static int restCoinPrint(int divResult,int irestCoin){
        System.out.println(divResult + "원 : " + irestCoin / divResult);
        return irestCoin % divResult;
    }
    public static void main(String[] args) {
        int wallet = 2680; //지갑이름
        int resultWallet = wallet; //resultWallet 계산용 지갑
        resultWallet = restCoinPrint(1000,resultWallet);
        resultWallet = restCoinPrint(500,resultWallet);

    }
}

