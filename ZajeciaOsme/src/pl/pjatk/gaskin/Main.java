package pl.pjatk.gaskin;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("==== LinkedList ====");

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Tomek");
        linkedList.add("Kasia");
        linkedList.add("Marek");


        for (String slowo :
                linkedList) {
            System.out.println(slowo);
        }
        System.out.println("==== ArrayList ====");

        List<String> arrayLista = new ArrayList<>();

        arrayLista.add("Tomek");
        arrayLista.add("Tomek");
        arrayLista.add("Kasia");
        arrayLista.add("Marek");


        for (String slowo :
                arrayLista) {
            System.out.println(slowo);
        }



        System.out.println(" ==== HashSet ==== ");


        Set<String> stringSet = new HashSet<>();

        stringSet.add("Ania");
        stringSet.add("Ania");
        stringSet.add("Tomek");
        stringSet.add("Marek");

        for (String imie :
                stringSet) {
            System.out.println(imie);
        }



        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Ania");
        treeSet.add("Ania");
        treeSet.add("Tomek");
        treeSet.add("Marek");


        for (String imie :
                treeSet) {
            System.out.println(imie);
        }


        System.out.println(" ==== HASHMAP ==== ");

        Map<Integer, String> hashmap = new HashMap<>();


        hashmap.put(1,"Polska");
        hashmap.put(2,"Niemcy");
        hashmap.put(3,"Polska");

        for (int i = 0; i < hashmap.size() + 1; i++) {
            System.out.println(hashmap.get(i));

        }

        System.out.println("==== Wyjatek ====");

        int[] tablica = {1,2,3,4,5};

        for (int i = 0; i < 12; i++) {
            try {

                System.out.println(tablica[i]);
                

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nie wolno tak! " + e);
            }catch (Exception e){
                System.out.println("***");
            }

        }


    }
}
