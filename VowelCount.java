import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels in the string : "+count);
		sc.close();
	}

}
