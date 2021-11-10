package generic_12.restrict;

public class Powder extends Material {	//Material을 상속한 재료마나 제너릭에서 사용

	@Override
	public void doPrinting() {
		System.out.println("파우더로 프린트 합니다.");
	}

	@Override
	public String toString() {
		return "재료는 파우더 입니다..";
	}
	

}
