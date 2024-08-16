package vo;

public class User {
	
	private String name=null;
	private int fullHp = 10;
	private int fullMp = 10;
	private int nowHp=10;
	private int nowMp=10;
	// exp 상속받아서 쓰기
	private int attack = 2;
	
	public User() {
		System.out.println("캐릭터가 생성되었습니다");
	}

	public User(String name, int fullHp, int fullMp, int nowHp, int nowMp, int attack) {
		super();
		this.name = name;
		this.fullHp = fullHp;
		this.fullMp = fullMp;
		this.nowHp = nowHp;
		this.nowMp = nowMp;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFullHp() {
		return fullHp;
	}

	public void setFullHp(int fullHp) {
		this.fullHp = fullHp;
	}

	public int getFullMp() {
		return fullMp;
	}

	public void setFullMp(int fullMp) {
		this.fullMp = fullMp;
	}

	public int getNowHp() {
		return nowHp;
	}

	public void setNowHp(int nowHp) {
		this.nowHp = nowHp;
	}

	public int getNowMp() {
		return nowMp;
	}

	public void setNowMp(int nowMp) {
		this.nowMp = nowMp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	public String toString() {
		return "Character [name=" + name + ", fullHp=" + fullHp + ", fullMp=" + fullMp + ", nowHp=" + nowHp + ", nowMp="
				+ nowMp + ", attack=" + attack + "]";
	}


}
