import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.println("1. 숫자를 입력해주세요");
      String input = sc.nextLine();
      int length = input.length();
      long result =0;
      if(length <16){
        for(int i=0;i<input.length();i++){
          result += (input.charAt(i) - 48) * (Math.pow(10,length-1));
          length--;
        }
        System.out.println("결과 : " + result);
        break;
      }else{
        System.out.println("잘못된 입력값입니다. 아웃풋 타입이 long형이므로 15자리까지 표현 가능합니다. 처음으로 돌아갑니다.");
      }
    }




  }
}