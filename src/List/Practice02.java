package List;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int c, money=0;
		System.out.println("요금을 투입 하세요 >>>");
		money = input.nextInt();
		System.out.println("==========커피 자판기==========");
		System.out.println("1. 커피(200)\t2. 코코아(250)\t3. 반환\t4. 종료");
		System.out.println("메뉴를 선택하세요 >>> ");
		c = input.nextInt();
		if (c == 4) 
			//break;
			System.out.println("종료합니다");
		else if (c==1) {
			System.out.println("맛있게 드세요.");
			money -= 200;
		}else if (c==2) {
			System.out.println("맛있게 드세요.");
			money -= 250;
		}else if (c==3) {
			System.out.println("거스름 돈 : " + money );
			money = 0;
		}else
			System.out.println("잘못 입력 하였습니다.");
		System.out.println("거스름 돈 : " + money);
		System.out.println("프로그램 종료");
	}
	

}
