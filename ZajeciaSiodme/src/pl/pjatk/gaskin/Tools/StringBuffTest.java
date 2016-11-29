package pl.pjatk.gaskin.Tools;

/**
 * Created by Gaskin on 29.11.2016.
 */
public class StringBuffTest {


	public static void test() {
		String str = "";

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			str += "a";
		}

		long stop = System.currentTimeMillis();
		System.out.println("String concatenation: " + (stop - start) + "ms");

		StringBuffer stringBuffer = new StringBuffer();

		start = System.currentTimeMillis();


		for (int i = 0; i < 100000; i++) {
			stringBuffer.append("a");
		}

		stop = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (stop - start) + "ms");

		StringBuilder stringBuilder = new StringBuilder();

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("a");
		}
		stop = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (stop - start) + "ms");
	}
}

