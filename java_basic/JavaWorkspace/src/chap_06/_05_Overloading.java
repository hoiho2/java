package chap_06;
// 메소드 오버로딩
    // 전달 값을 타입 즉 자료형이 다르거나 또는 전달 값이 개수가 다르면 메소드 오버로딩 가능
public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

  //  public static int getPowerStr(String strNumber){  // 문자열 -> 숫자로
    public static int getPower(String strNumber){  // 메소드명 중복해서 선언 가능
        int number = Integer.parseInt(strNumber);
        return number * number;

    }


    //public static int getPowerByExp(int number, int expoment){
    public static int getPower(int number, int expoment){
        int result = 1;
        for (int i = 0; i < expoment; i++) {
            result *= number;

        }
        return result;
    }




    public static void main(String[] args) {
        // 메소드 오버로딩
        /* 같은 이름의 메소드를 여러 번 선언
        *  1. 전달값의 타입이 다르거나
        *  2. 전달값의 갯수가 다르거나
        * */
        System.out.println(getPower(3)); //3*3 =9
//        System.out.println(getPowerStr("4")); //4*4=16
        System.out.println(getPower("4")); //4*4=16
        System.out.println(getPower(3,3)); //3*3*3=27
    }
}
