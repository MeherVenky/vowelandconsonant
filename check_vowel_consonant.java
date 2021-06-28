import java.util.Scanner;

public class check_vowel_consonant{
	
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a letter");
	 char ch=sc.next().charAt(0);

	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch+" it is vowel");
		break;
	default :
		System.out.println(ch+" it is consonant");
	}
}
}