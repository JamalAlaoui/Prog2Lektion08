package opgave03;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Janus", "Markus", "Peter", "Line", "Mads", "Søren", "Mathias", "Trine", "Anders"));
        int number = countStringsOfLength(names, 5);
        System.out.println("number = " + number);
        System.out.println();
        printElementsOfLength(names, 5);
        System.out.println();
        System.out.println("Navne med længde = 5 : " + elementsOfLength(names, 5));

    }


    /**
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return the number of elements in strings with the specified length
     */
    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        //TODO


        return countStringsOfLength(strings, length, 0, strings.size()-1);
    }

    private static int countStringsOfLength(ArrayList<String> strings, int length, int start, int slut) {

        // base case --> når listen indeholder ét element

        if (start > slut){
            return 0;
        }

        if (start == slut) {
            if (strings.get(start).length() == length) {
                return 1;
            } else {
                return 0;
            }
        }

                int mid = start + (slut - start) / 2;
                int laveEnde = countStringsOfLength(strings, 5, start, mid);
                int højdeEnde = countStringsOfLength(strings, 5, mid + 1, slut);

                return laveEnde + højdeEnde;

        }



    /**
     * Writes the elements of strings to the console with the specified lenght
     * @param strings ArrayList of elements
     * @param length the length to test for
     */
    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        //TODO
    printElementsOfLength(strings, length, 0);

    }

    private static void printElementsOfLength(ArrayList<String> strings, int length, int index) {
        // denne metode følger IKKE løs-kombiner skabelonen, det er en linær rekursiv tilgang, som i dette tilfælde var nemmere
        //TODO ---- base case
        if (index > strings.size()-1){
            return;
        }

        // TODO --- handling
        if (strings.get(index).length() == length){
            System.out.println(strings.get(index).toString());
        }

        //TODO --- Rekursive kald

         printElementsOfLength(strings, length, index + 1);

    }

    /**
     *
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return a new ArrayList with all elements from strings with the specified lenght
     */
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        //TODO

        return elementsOfLength(strings, length, 0, strings.size()-1 );
    }


    private static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length, int start, int slut) {
        //TODO

        //TODO--- base case

        if(start > slut){
            return new ArrayList<>();
        }

        if (start == slut){
            ArrayList<String> resultat = new ArrayList<>();
            if (strings.get(start).length() == length){
                resultat.add(strings.get(start));
            }
            return resultat;
        } else {
            //TODO --- rekursive kald
            int mid = start + (slut - start) / 2;
            ArrayList<String> laveEnde = elementsOfLength(strings, length, start, mid);
            ArrayList<String> højdeEnde = elementsOfLength(strings, length, mid + 1, slut);

            laveEnde.addAll(højdeEnde);

            return laveEnde;
        }



    }
}
