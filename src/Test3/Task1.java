package Test3;

public class Task1 {
    public static void main(String[] args) {

    }
    public static void sort(int[] array){
        for (int i = array.length - 1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
