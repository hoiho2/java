package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        // 문자열의 내용을 비교할 때는 등호를 쓰지 말고 equals 사용
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); //대소문자 달라도 false
        System.out.println(s2.equalsIgnoreCase("python")); //true
                   // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        
        // 문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); //false

        /*새로운 String 객체를 생성했기 때문에,
        s1과 s2는 서로 다른 메모리 주소를 가지게 됩니다. 그래서 s1 == s2는 false가 됩니다.*/






    }
}
