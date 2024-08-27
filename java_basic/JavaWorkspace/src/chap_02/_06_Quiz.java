package chap_02;

import javax.swing.*;

public class _06_Quiz {
    public static void main(String[] args) {
        // 퀴즈
        /* 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성
        * 조건
        * - 키가 120cm 이상인 경우에만 탑승 가능
        * - 삼항 연산자 이용
        *
        * 실행결과
        *  - 키가  115cm 이므로 탑승 불가능합니다. //값이 115인 경우
        *  - 키가 121cm 이므로 탑승 가능합니다.*/ // 값이 121인 경우

        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int height_1 = 115;
        int height_2 = 121;

        String ck_x = (height_1>120) ?  "키가"+height_2+"이므로 탑승 가능" : "키가 "+height_1+"이므로 탑승 불가" ;
        String ck_y = (height_2>120) ? "키가 "+height_2+"이므로 탑승 가능" : "키가"+height_1+"이므로 탑승 불가";

        System.out.println(ck_x);
        System.out.println(ck_y);

        // 강의 답변
        int height = 121; //115
        String result = (height >= 120) ? " 탑승 가능합니다" : " 탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로" + result);
    }
}
