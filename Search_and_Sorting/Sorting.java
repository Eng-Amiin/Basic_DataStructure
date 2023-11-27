package Search_and_Sorting;

import java.util.Arrays;

public class Sorting {


    public static void main(String[] args) {
        int[] data = {20,1,6,9,2,4,30,22};


//        System.out.println("original Array :");
//        System.out.println(Arrays.toString(data));
        Sorting sort = new Sorting();
//        sort.selectionSort(data);
//        System.out.println("Sorted Array");
//        String result = Arrays.toString(sort.selectionSort(data));
        String result1 = Arrays.toString(sort.bubbleSort(data));
        System.out.println(result1);


    }


    public int[] selectionSort(int[] data){
        int size = data.length;
        int min;
        for(int index=0; index<size-1; index++){
            min = index;
            for (int value=index; value<size; value++) {
                if (data[value] < data[min])
                    min = value;
            }
            int temp = data[min];
            data[min] = data[index];
            data[index] = temp;

        }

        return data;
    }



    public int[] bubbleSort(int[] data){
        int size = data.length;
        for(int index=size-1; index>0; index--){
            for (int value=0; value<index; value++) {
                if (data[value] > data[value+1]) {

                    int temp = data[value];
                    data[value] = data[value+1];
                    data[value + 1] = temp;
                }
            }


        }

        return data;
    }


}
