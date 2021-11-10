package class_06;
//ex20
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
	
	//계좌생성하기
	private static void createAccount() {
		//작성 위치
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		for (Account account : accountArray) {
			if (account==null) {
				account = new Account(ano,owner,balance);
				System.out.println("결과:계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		//작성 위치
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (Account account : accountArray) {
			if (account!=null) {
				System.out.println(account.getAno()+"\t"+
						account.getOwner()+"\t"+
						account.getBalance());
			}
		}
	}

	//예금하기
	private static void deposit() {
		//작성 위치
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);	//findAccount메소드 호출
		System.out.print("예금액: ");
		account.setBalance(account.getBalance()+scanner.nextInt());
		System.out.println("결과:예금이 성공되었습니다.");
	}

	//출금하기
	private static void withdraw() {
		//작성 위치
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		System.out.print("출금액: ");
		account.setBalance(account.getBalance()-scanner.nextInt());
		System.out.println("결과:출금이 성공되었습니다.");
	}
	
	//Account배열에서 ano와 동일한 Account객체 찾기
	private static Account findAccount(String ano) {
		//작성 위치
		for(Account account : accountArray) {
			if (ano.equals(account.getAno()))
					return account;
		} return null;
	}

}
