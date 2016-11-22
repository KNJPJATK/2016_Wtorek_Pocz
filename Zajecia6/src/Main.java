import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        /*Shape cos = new Shape(){

        }*/

//
//        OuterClass zewnetrzna = new OuterClass();
//
//        OuterClass.InnerClass wewnetrzna = zewnetrzna.new InnerClass();
//
//        wewnetrzna.printSomething();
//

        Pies fafik = new Pies();
        Kot kotel = new Kot();

       String dzwiekPsa =  fafik.wydajDzwiek();
        System.out.println(dzwiekPsa);
        System.out.println(kotel.wydajDzwiek());
    }

    public class Circle extends Square{
        public Circle(int x, int y, int sciana) {
            super(x, y, sciana);
        }
    }
}
