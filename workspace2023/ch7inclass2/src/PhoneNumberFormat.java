
public class PhoneNumberFormat {

	public static void main(String[] args) {
		String phoneNumber = "9197187350";
		String formattedNumber="";
		formattedNumber = "("+phoneNumber.substring(0,3)+") ";
		formattedNumber = formattedNumber+ phoneNumber.substring(3,6)+"-";
		formattedNumber = formattedNumber+ phoneNumber.substring(6);
		System.out.println("The formatted phone number is "+ formattedNumber);

	}

}
