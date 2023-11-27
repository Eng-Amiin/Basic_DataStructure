package Search_and_Sorting;

public class Searching <T extends Comparable<T>>{

    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        boolean res = Searching.linearSearching(data,0,7,45);
//        if(res)
//            System.out.println("Taget Is Found");
//        else
//            System.out.println("Target Is Not Found");
//        System.out.println();

        boolean res = Searching.binarySearch(data,0,19,20);
        if(res)
            System.out.println("Taget Is Found");
        else
            System.out.println("Target Is Not Found");
        System.out.println();



    }

    //linear searching

    public static <T> boolean linearSearching(T[] data,int min,int max,T target){
        int index = min;
        boolean found = false;
        while (!found && index<=max) {
            if(data[index].equals(target))
                found =true;
            index++;

        }

        return found;
    }

    //Binary search

    public static <T extends Comparable<T>> boolean binarySearch(T[] data,int min,int max,T target){

        int low = min;
        int height = max;
        boolean found = false;
        while (!found && low<=height) {
            int mid = (low + height) / 2;
            if(data[mid].compareTo(target) == 0)
                found = true;
            else if(data[mid].compareTo(target) > 0)
                height = mid-1;
            else
                low = max+1;

        }

        return found;

    }





}
