package Dates;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Dates {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
	}
}
