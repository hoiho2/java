package chap_05;
// 퀴즈5
/*  배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오
   조건
  - 신발 사이즈는 250부터 295까지 5단위로 중가
  - 신발 사이즈 수는 총 10가지
    출력결과
  =>    사이즈 250 (재고있음)
        사이즈 255 (재고 있음) */
public class _06_Quiz {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i =0; i  <sizeArray.length; i++){
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray){
            System.out.println("사이즈" + size + " (재고있음)");
        }
    }

}
