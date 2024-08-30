package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        //치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        //For
        int max = 20; //최대 치킨 판매 수량
        int sold =0 ; // 현재 치킨 판매 수량
        int noshow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i<=50; i++){
            System.out.println(i + "번 손님, 주문치킨나옴");

            //손님이 없다면?(nohow)
            if (i == noshow){
                System.out.println(i+"번 손님 노쇼로 패스");
                continue;
            }


            sold++; // 판매처리
            if (sold ==max) {
                System.out.println("재료소진");
                break;
            }

        }
        System.out.println("영업종료");

        System.out.println("------------------------------------");

        // While문
        sold=0;
        int index = 0; // 손님 번호
        //while (index <=50){  // 이 방법이나 밑에 true방법 다 가능
        while(true){
            index++;
            System.out.println(index + " 번 손님, 치킨 나옴");

            // 손님이 없다면(noshow)
            if (index ==noshow) {
                System.out.println(index + "번 손님, 노쇼로 패스");

                continue;

            }
            sold++; //판매관리
            if (sold ==max){
                System.out.println("재료소진");
                break;
            }

        }
        System.out.println("영업종료");





    }
}
