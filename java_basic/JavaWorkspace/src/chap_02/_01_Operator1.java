package chap_02;
// 산술 연산자
public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2 ); //2
        System.out.println(4 * 2 ); //8
        System.out.println(4 / 2);//2
        System.out.println(5 / 2); //2  (실수는 정수로 변환)
        System.out.println(2 / 4); //0
        System.out.println(4 % 2); //0 나눈 나머지
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); //8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a * b ;
        System.out.println(c); //200

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10 ++이 뒤에 붙으면 먼저 실행하고 다음에 변수에다가 1이 더해짐
        System.out.println(val); //11

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 :" + waiting++); // 대기 인원 : 0
        // (아무도 없는 은행에 대기표를 뽑으면 0이 나오고 그다음 순서는 1이 된다
        System.out.println("대기 인원 :" + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 :" + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 :" + waiting); // 총 대기 인원 :3







    }
}
