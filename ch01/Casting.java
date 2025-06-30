package ch01;

public class Casting {
    //형변환
    //다운 캐스팅 (down-casting)
    //업 캐스팅 (up-casting)
    public static void main(String[] args) {
        int n1 = 100;
        System.out.println(n1);
        double d1 = n1; //묵시적으로 업 캐스팅
        System.out.println(d1);
        long longType = 100L;
        int intType = (int) longType; //명시적 다운 캐스팅


    }
}
