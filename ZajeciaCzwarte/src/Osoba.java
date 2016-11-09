/**
 * Created by rpi on 08.11.16.
 */
public class Osoba {

    private String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String nazwisko) {
//        this.nazwisko = nazwisko;
        this(null, nazwisko);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    static int metoda(int liczba) {
        if (liczba == 0) {
            return 0;
        }
        else if (liczba == 1) {
            return 1;
        }
        else {
            return metoda(liczba - 1) +
                    metoda(liczba -2);
        }
    }

}
