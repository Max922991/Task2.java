package Algoritmi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

//        System.out.println(linearSearch(list, "BBB"));

        int[] mass = new int[]{8, 12, 2, 5, 89, 4, 15, 29};
        bubbleSort(mass);
        for(int i : mass)
            System.out.print(i + ", ");

    }
    private static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }
        }
    }



    private static int linearSearch(List<String> list, String arg){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(arg)){
                return i;
            }
        }
        return -1;
    }
}
