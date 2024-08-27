package chap_01;
// 상수
public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; //국가 번호(빨리)
        //final =상수 (값이 바뀔 수 없다)
       // KR_COUNTRY_CODE = "8282"; // 오류 남
        System.out.println(KR_COUNTRY_CODE);
        
        final double PI = 3.141592; //원주율
        final String DATE_OF_BIRTH = "2001-12-31"; //생년월일
    }
}
