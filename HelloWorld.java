import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println("오늘의 날자 :" + format.format(date));
	}
}