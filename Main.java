// PARTNER NAME: Jonathan Smith
// PARTNER NAME:
// CS111 SECTION #: 1285
// DATE: Feb. 4

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surename = "SPECIMAN";
		String givenname = "Test V";
		String first9 = "000000725";
		String catag1 = "C09";
		String cardnum1 = "SRC0000000725";
		String birth = "Ethiopia";
		String terms = "None";
		String birth1 = "01 JAN 1920";
		String validfrom = "01/01/80";
		String expire = "05/10/11";
		String sex = "M";


		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ surename);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenname);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ first9 +"       " + catag1 +"       "+ cardnum1);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+ birth);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /            "+ terms);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birth1 +"     " + sex);    
		System.out.println("║                       Valid From:     "+ validfrom);
		System.out.println("║                       Card Expires:   "+ expire);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}