package pierwszyPakiet;

public class Rzutowanie {
	public static void main (String[] args){
		int a=2;
		double b=13.5;
		char k=100;
		System.out.println((int)k);
		
		//pierwsze rzutowanie
		int c=(int)b/a; /*Tak nie robimy dlaczego ?
					w tym przykladzie probujemy przypisac do zmiennej
					C typu int wynik ilorazu b/a, ktorym jest liczba zmiennoprzecinkowa aby
					kompilator nie prostesotwa³ rzutujemy doubla na inta (int)b/a;
				   */
		System.out.println(c);
		
	}
}
