package object06.final_ex;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;	//지구의 반지름
	static final double EARTH_SURFACE_AREA;		//지구의 표면적
				//final키가 들어가 있는 상수는 초기값이 반드시 할당.
				//상수 이름은 대문자를 사용, 변수이름은 첫문자 소문자
	
	static {	// static상수의 표면적을 초기화
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS+EARTH_RADIUS;
	}
	
	// static final : 모든 객체에서 참조할 경우 객체 내무에 상수를 로드하지 않고
	//				  stack영역에 저장해서 모든 객체들이 공유해서 사용하도록 설정.

}
