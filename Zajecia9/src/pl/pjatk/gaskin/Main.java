package pl.pjatk.gaskin;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String... args) throws ArrayIndexOutOfBoundsException, IOException {


        System.out.println("============= Scanner ============");

        Scanner scan = null;
        try {
            scan = new Scanner(new File("test.txt"));


            while (scan.hasNextInt()) {
                int a = scan.nextInt();
                System.out.println(a);
            }

            scan.nextInt();

        }catch (FileNotFoundException e){
            System.out.println("Nie ma takiego pliku!");
        }catch (NoSuchElementException e){
            System.out.println(e);
        }
        finally {
            scan.close();
        }


        System.out.println("============= BufferedReader ============");

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("============= Lapanie blędów w tablicy ============");


        wypiszTablice();

    }



    static public void wypiszTablice(){
        int[] array = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < 15; i++) {
                try{
            System.out.println(array[i]);
                }catch (Exception e){
                    System.out.println("Ten array ma tylko " + array.length + " elementów.");
                    System.out.println(e.getMessage());
                }finally {
                    System.out.println("Jesteśmy w bloku finally");
                }
        }

    }
}
