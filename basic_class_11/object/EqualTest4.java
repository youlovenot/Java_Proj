package basic_class_11.object;

import java.util.Calendar;
import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
		/*
		 * 1. toString 메소드를 재정의: "2021년, 09월, 27일 입니다."
		 * 2. equals 메소드 재정의: 두개의 객체를 만들어서 년, 월, 일이 같을때: True를 리턴
		 * 3. hashcode 메소드 재정의: 일 + 월 + 년도
		 */
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day,month,year);	//Objects.hash() <==해쉬코드를 생성
	}
	@Override
	public boolean equals(Object obj) {	//업캐스팅 되어서 들어옴
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;	//다운 캐스팅
			if(day==date.day&&month==date.month&&year==date.year)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public String toString() {
		return year+"년, "+month+"월, "+day+"일 입니다.";
	}
	
	
}

public class EqualTest4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		MyDate d1 = new MyDate(cal.get(Calendar.DATE),
				cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
		MyDate d2 = new MyDate(28,9,2021);
		
		System.out.println(d1);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d1.equals(d2));
	}

}
