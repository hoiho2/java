package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//        String name;
//        name = "호호";
        String name = "호호";
        int hour = 15;
        
        System.out.println(name + "님, 배송이 시작됩니다 " + hour+ "시");
        System.out.println(name + "님, 배송 완료");

        double score = 90.5;
        char grade = 'A';
        name = "hoho";
        // 여러 글자는  " " 안에 한 글자는  ' '  안에 넣기

        System.out.println(name + "님 " +"점수= " + score);
        System.out.println(name + "님 " + "등급= " + grade);

        boolean pass = true;
        System.out.println(("이번 시험 합격? " + pass));

        double d = 3.14123123123;
        float f = 3.14123123123F;
        //float은 double보다 정밀도가 떨어짐  그래서 정밀한 데이터를 다루면 double 사용
        // 3.14는 둘 다 잘 나오지만 더 긴 소수점은 float가 표현 x
        System.out.println(d);
        System.out.println(f);

        //int i = 10000000000000; 너무 큰 숫자는 int가 감당x
        long l = 10000000000000l; // long 은 int보다 큰 범위 가능
        l = 1_000_000_000_000l;
        System.out.println(l);

        // 적정한 크기 자료형 변수를 선언해서 사용
       // int,long,float,double, char, String , boolean
    }
}
