package pierwszyPakiet;

import java.util.Scanner;

public class PobieranieDanych {

	public static void main(String[] args) {
		String imie;
		int wiek;
		System.out.println("Podaj swoje imie: ");
		Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();// w tym momencie nastepuje odebranie
		//od uzytkownika ciagu znakow zakonczonego kliknieciem ENTER
		System.out.println("Twoje imie: " +imie);
		
		System.out.println("Podaj swoj wiek: ");
		wiek = odczyt.nextInt();
		System.out.println("Twoj wiek to: "+wiek);
		
		System.out.println(imie +" "+ wiek);
		
	}

}
