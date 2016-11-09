/**
 * Created by rpi on 08.11.16.
 */
public class Main {

    public static void main(String[] args) {
//        int[] tab = {3, 4, 5};
//
//        for (int e : tab) {
//
//        }
//        System.out.println(Osoba.metoda(1));
//        Osoba osoba = new Osoba("Jan", "Kowalski");
//        System.out.println(osoba.getImie());
//        System.out.println(Narzedziowa.get2());
//        System.out.println((new Narzedziowa()).get2());

        String n1 = "Ala";
        String n2 = "Ala";
        String n3 = n1;
        String n4 = new String("Ala");

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(n3 == n4);
        System.out.println(n3.equals(n4));
        System.out.println(n1 == "Ala");

    }

}
