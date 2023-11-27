package Recursion;
import java.util.Scanner;

public class binarysearch<T extends Comparable<T>> {


    public static void main(String[] args) {
        Integer[] data={1,2,3,4,5,6};
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter The Number You Are Searching :");
        int target=input.nextInt();
        boolean res=binarysearchRecursion(data,0,4,target);
        if (res)
            System.out.println(target+" Is Found");
        else
            System.out.println(target+" Is Not Found");
    }







    private static <T extends Comparable<T>> boolean binarysearchRecursion(T[] data, int min,int max,T target){
        int lower=min;
        int heigher=max;
        boolean found=false;
        if (!found && lower<=heigher){
            int middle=(lower+heigher)/2;
            if (data[middle].compareTo(target)==0){
                found=true;
            }
            else if (data[middle].compareTo(target)>0){
                return binarysearchRecursion(data, min, middle - 1, target);
            }
            else
                return binarysearchRecursion(data, middle + 1, max, target);
        }
        return found;
    }


}