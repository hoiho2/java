package chap_04;
// 퀴즈 4 . 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        /*
        * 조건
         - 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
         - 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        *  주차요금 예시
         - 일반 차량 5시간 주차 시 20000원
         - 경차 5시간 주차 시 10000원
         - 장애인 차량 10시간 주차 시 15000원

         *실행 결과
         * 일반 차량 5시간 주차시 20000원 => 주차 요금은 20000 원입니다.
         * 경차 5시간 주차 시 10000원 => 주차 요금은 10000원입니다.
         * 장애인 차량 10시간 주차 시 15000원 => 주차 요금은 15000 원입니다.

        * */

public class _12_Quiz {
    public static void main(String[] args) {
        int hour = 8; //주차 시간
        boolean isSmallCar = false; //경차 여부
        boolean withDisabledPerson = false; //장애인 차량 여부

//       // int fee = hour * 4000; // 시간당 4000원 요금
//        for (int f = 0; f <30000 ; f++) {
//            if (isSmallCar == true){
//                System.out.println("주차 요금은"+fee*0.5+"입니다");
//                break;
//            }
//
//        }
//        System.out.println("주차요금"); 내가 한 오답


        //////////////////////////////////////////////////////
        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)

        //30000원 외 초과 시 일일 최대 요금으로 수정
        if (fee >30000){
            fee = 30000;
        }
        //경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson){
            fee /= 2; // 50% 할인
                        // 참고 : 할인율 50% 곱도 가능 1) fee = (int)(fee*0.5f)
                                   //2) fee *= 0.5f;
        }
        //실행 결과 출력
        System.out.println("주차 요금은"+ fee+"원 입니다.");




    }
}
