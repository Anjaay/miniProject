package controller;

import java.util.ArrayList;
import java.util.List;
import vo.User;
import vo.Equipment;
import vo.Potion;

public class UserControll {
	User u = new User();
	List<Potion> PostionList = new ArrayList(); //인벤토리
	List<Equipment> EquipmentList = new ArrayList();
	
	
	public UserControll() {
		super();
	}
	
	public String chaName(String name) {
		u.setName(name);
		
		return u.getName();
	}
	
	
	public void chaStatus() {
		System.out.println("["+u.getName()+"의 현재 상태]\n"+
							"체력: "+u.getNowHp()+"/"+u.getFullHp()
							+ "\n마나: "+u.getNowMp()+"/"+u.getFullMp()
							+"\n경험치: 현재 경험치 / 레벨업 필요 경험치(미구현)");
	}
	
	public void inventoryAdd() {
		// 인벤토리에 추가
	}
	
	// 인벤토리에서 아이템 삭제
	public void inventorDel() {
		
	}
	
	
	
	
	
	
	
}
