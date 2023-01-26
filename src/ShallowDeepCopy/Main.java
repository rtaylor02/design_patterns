package ShallowDeepCopy;

import java.util.ArrayList;

/**
 * This code demonstrate the difference between shallow and deep copy.
 * clone() of Object performs only shallow copy.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());

        list.get(0).add("ABC");
        list.get(1).add("XYZ");

        System.out.println("original list: " + list);

        /*
        Perform shallow copy
         */
        ArrayList<ArrayList<String>> copy = (ArrayList)list.clone();
        System.out.println("clone list: " + copy);
        copy.get(0).add("DEF"); // This applies to both list and copy as element 0 is shallow-copied.

        System.out.println("==========SHALLOW COPY========");
        System.out.println("original list: " + list);
        System.out.println("clone list: " + copy);

        /*
        Adding new member outside original's original references
         */
        list.add(new ArrayList<>());
        list.get(2).add("123"); // Only added to original list
        list.get(2).add("999"); // Only added to original list

        System.out.println("==========SHALLOW COPY========");
        System.out.println("original list: " + list);
        System.out.println("clone list: " + copy);
    }
}
