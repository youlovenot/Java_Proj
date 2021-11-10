package collection.map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberHong = new Member(1003,"홍길동");
		Member memberSong = new Member(1004,"송유나");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSong);
		
		System.out.println("=====전체 객체 내용을 출력=====");
		memberHashMap.showAllMember();
		
		System.out.println("=====객체 정보 삭제=====");
		memberHashMap.removeMember(1003);
		memberHashMap.removeMember(memberSong.getMemberid());
		memberHashMap.showAllMember();
		
	}

}
