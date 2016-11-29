package pl.pjatk.gaskin.Tools;

import java.util.StringTokenizer;

/**
 * Created by Gaskin on 29.11.2016.
 */
public class TokenizerExample {
	public static void test() {
		// Tworzymy Stringa
		String str = "ABC,DEF,,FGHT";
		// Tworzymy delimiter dla naszego StringTokenizera
		// Zgodnie z opisem z dokumentacji
		// https://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
		String delim = ",";
		// Tworzymy StringTokenizera, warto zwrócić uwage na flagę returnDelims ustawioną na true
		StringTokenizer tok = new StringTokenizer(str, delim, true);


		// W pętli while wypisujemy tokeny aż nie będzie ich więcej - wypiszemy wszystkie tokeny z naszego Stringa
		boolean expectDelim = false;
		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			if (delim.equals(token)) {
				if (expectDelim) {
					expectDelim = false;
					continue;
				} else {
					// Nieoczekiwany delimiter oznacza pusty token
					token = null;
				}
			}
			//wypisujemy token
			System.out.println(token);
			expectDelim = true;
		}
	}
}
