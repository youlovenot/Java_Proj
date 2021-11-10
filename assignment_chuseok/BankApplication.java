package assignment_chuseok;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	private static ArrayList<Account> acList = new ArrayList<Account>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {
		//작성위치
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		acList.add(new Account(ano, owner, balance));
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
		//작성위치
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for (Account account : acList) {
			System.out.println(account.getAno()+"\t"+account.getOwner()
					+"\t"+account.getBalance());
		}
	}
	//예금하기
	private static void deposit() {
		//작성위치
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance()+money);
		System.out.println("결과: 예금이 성공되었습니다.");
		
		
	}
	//출금하기
	private static void withdraw() {
		//작성위치
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("출금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance()-money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//작성위치
		for (Account account : acList) {
			if (ano.equals(account.getAno())) return account;
		}
		return null;
	}
}
