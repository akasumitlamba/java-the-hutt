//You need a program to convert days to seconds.
// The given code takes the amount of days as input. Complete the code to convert it to 
// seconds and output the result.
import java.util.Scanner;
public class timeconverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here
		int hour=days*24;
		int min= hour*60;
		int sec=min*60;
		System.out.println(sec);
	}
}