package view;

import java.util.Scanner;

import controller.UserControll;

public class UserMenu {
	UserControll cc;
	Scanner sc= new Scanner(System.in);
	
	public void mainMenu() {
		
		characterCreate(); // 캐릭터 생성
		
		System.out.println("========게임 시작========");
		while(true) {
			System.out.println("========메인 메뉴========");
			System.out.println("1. 캐릭터 현재 상태");
			System.out.println("2. 인벤토리 메뉴");
			System.out.println("3. 상점으로");
			System.out.println("4. 사냥터 가기");
			System.out.print("숫자 선택: ");
			int choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1: characterNow(); break;
			case 2: // inventoryMenu(); 미구현
			case 3: 
			case 4: 
				default: System.out.println("잘못 입력했습니다 다시 입력해주세요");
				}
		}
	}
	
	
	// 캐릭터 생성
	public void characterCreate() {
		cc = new UserControll(); 
		
		System.out.print("캐릭터 이름: ");
		String cn=sc.next();
		
		String resname = cc.chaName(cn);
		System.out.println(resname+" 이(가) 생성되었습니다!");
		System.out.println();
	}
	
	// 캐릭터의 현재 상태
	public void characterNow() {
		cc.chaStatus();	// hp,mp,exp(미구현)체크
								//인벤토리 남은 칸 n/n 간단 표기
	}
	
	public void inventoryMeun() {
		System.out.println("========인벤토리========");
		
	}
	
	
	
	
	
}
