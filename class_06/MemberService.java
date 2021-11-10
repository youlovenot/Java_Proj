package class_06;
public class MemberService {	//ex15
	//작성 위치
	public boolean login(String id,String password) {
		if(id=="hong"&&password=="12345")
			return true;
		else return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
