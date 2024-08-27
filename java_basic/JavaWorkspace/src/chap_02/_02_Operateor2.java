package chap_02;

import java.sql.SQLOutput;

public class _02_Operateor2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        num = num +2;
        System.out.println(num); //12

        num = num / 2 ;
        System.out.println(num); //6

        // 복합 대입 연산자
        num = 10;
        // num = num + 2;
        num += 2;
        System.out.println(num); //12

        // num = num * 2;
        num *= 2 ;
        System.out.println(num); //24




    }
}
