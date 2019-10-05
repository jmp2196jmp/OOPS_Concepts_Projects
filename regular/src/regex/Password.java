package regex;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ts=sc.next();
		String p="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=.*[\\S+$]).{8,}";
		if(ts.matches(p))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
