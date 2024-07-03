package RandomQuestions;
import java.util.Scanner;
public class StringToByte{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		byte[] arr = input.getBytes();
		for(byte b: arr){
			System.out.print(b);
		}
		System.out.println();
		sc.close();
	}
}
