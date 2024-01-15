import java.util.Scanner;

public class CountSpaces {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your favorite quote ");
		String quote="Success is how high you bounce once you hit bottom";
		quote = input.nextLine();;
		int count=0;
		char character;
		for(int i=0; i < quote.length(); ++i){
			character = quote.charAt(i);
			if(character == ' ') {
				count++;
			}
		}
		System.out.println("The number of spaces in the quote: \n"+ quote + "\nis "+ count);
	}
}
