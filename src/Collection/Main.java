package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int[] mass = new int[]{1, 23, 44, 22, 4241, 133, 12, 42, 444, 2};

        fillCollection(arrayList, mass);
        fillCollection(linkedList, mass);
        fillCollection(hashSet, mass);
        fillCollection(treeSet, mass);

        System.out.println("\nArrayList");
        printCollection(arrayList);
        System.out.println("\nLinkedList");
        printCollection(linkedList);
        System.out.println("\nHashSet");
        printCollection(hashSet);
        System.out.println("\nTreeSet");
        printCollection(treeSet);

        String s1= "dewrdw";




    }
    private static void printCollection(Collection<Integer> collection){

        for(Integer element : collection){
            System.out.print(element + ", ");
        }
    }
    private static void fillCollection(Collection<Integer> collection, int[] mass){

       for(int element : mass){
           collection.add(element);
       }
    }
}
