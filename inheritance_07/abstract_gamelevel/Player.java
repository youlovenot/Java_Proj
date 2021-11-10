package inheritance_07.abstract_gamelevel;

public class Player {
	private PlayerLevel level;	//PlayerLevel: 데이터 타입, level: 인스턴스변수
	
	public Player() {	//생성자
		level = new BeginerLevel();		//객체 생성
		level.showLevelMassage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradLevel (PlayerLevel level) {	//업캐스팅
		this.level = level;
		level.showLevelMassage();
	}
	public void play(int count) {
		level.go(count);
	}
}
