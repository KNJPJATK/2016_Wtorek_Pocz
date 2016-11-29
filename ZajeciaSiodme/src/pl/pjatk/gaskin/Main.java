package pl.pjatk.gaskin;

import pl.pjatk.gaskin.EnumExample.EnumTest;
import pl.pjatk.gaskin.EnumExample.Level;
import pl.pjatk.gaskin.Singleton.ElvisEnum;
import pl.pjatk.gaskin.Tools.StringBuffTest;
import pl.pjatk.gaskin.Tools.TokenizerExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    System.out.println("=============== Enum ===============");

	    // Tworzymy Enum Level
	    // Enumy to też zwyczajne klasy, możemy analogicznie do zwykłych klas wywoływać ich pola i metody.

	    Level poziom = Level.LOW;
	    Level poziom2 = Level.HIGH;

	    System.out.println("Wartość pola \"Druga\" w enumie typu LOW: " + poziom.druga);
	    System.out.println("Wartość pola \"Druga\" w enumie typu HIGH: " + poziom2.druga);

	    System.out.println("Singleton(klasa która może mieć tylko jedną instancję) stworzony za pomocą enuma: ");
	    ElvisEnum.INSTANCE.leaveTheBuilding();

	    System.out.println("========== StringBuilder ==========");

	    // Działa analogicznie do Stringa, służy do budowania takowego - działa dużo szybciej.

	    StringBuilder stringBuilder = new StringBuilder();

	    System.out.println("Dodajemy elementy do naszego StringBuildera");

	    for (int i = 0; i < 10; i++) {
		    stringBuilder.append("a");
	    }

	    System.out.println("Wypisujemy naszego zbudowanego stringa");
	    System.out.println(stringBuilder.toString());

		// Test prędkości wykonywania "sklejania stringów" a prędkości budowania stringa StringBuilderem

//	    StringBuffTest.test();

	    System.out.println("========== StringTokenizer ==========");

	    TokenizerExample.test();

	    System.out.println("========== Generics ==========");

	    // Typ generyczny jest ograniczony do klas które dziedziczą po Number. Nie możemy stworzyć instancji obiektu z typem String.

//	    Pudelko<String> box = new Pudelko<>("Ala ma kota");

		// Bez problemu możemy utworzyć pudełko które używa Integera lub Double - dziedziczą on po klasie Number

	    Pudelko<Double> box1 = new Pudelko<>(17.0);
	    Pudelko<Integer> box2 = new Pudelko<>(10);

	    // Mimo różnych obiektów przetrzymywanych w obiekcje "Pudelko" możemy odwoływać się do jego wnętrza w ten sam sposób

	    System.out.println(box1.cos);
	    System.out.println(box2.cos);

	    System.out.println("========== Listy ==========");


	    // ArrayList jest jedną z implementacji interfejsu List. Jest to obiekt bardzo podobny do zwykłego array'a.
	    // Listy używają generyczności by móc przetrzymywać obiekty dowolnego typu.

		List<Integer> mojaLista = new ArrayList<Integer>();

		// Dodajemy elementy za pomocą metody add - tutaj na dwa różne sposoby
	    // (zwyczajnie 'doklejając' element do listy i wsadzając go na konkretne miejsce)

		mojaLista.add(5);
		mojaLista.add(mojaLista.size()-1 ,5);

		// Lista może przechowywać obiekty dowolnego typu.
	    // Warto zwrócić uwagę że gdy definiujemy listę jako List<String> nie musimy ponownie zaznaczać jakie elementy się
	    // w konkretnej implementacji - w tym przypadku ArrayList
	    // możemy użyć "diamond operatora" <> a kompilator sam wywnioskuje jaki typ znajduje się w liście

		List<String> listaImion = new ArrayList<>();
		listaImion.add("Kuba");
	    listaImion.add("Marcin");
	    listaImion.add("Karol");

	    // wypisujemy wszystkie elementy listyImion za pomocą pętli forEach

	    for (String name :
			    listaImion) {
		    System.out.println(name);
	    }

		// analogicznie do zwykłego arraya elementy listy indeksowane są od 0

	    int pierwszyElement = listaImion.indexOf("Marcin");
	    if(pierwszyElement != -1) {
		    System.out.println("Znaleziono imie Marcin na pozycji: " + pierwszyElement);
	    }else
		    System.out.println("Nie znaleziono");
    }
}
