package Recursion;

import javax.swing.text.Position;

public class Recursion {

    public int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return num + factorial(num - 1);
    }

    public int factorialIteration(int num) {

        int result = 1;
        for (int i = num; i >= 1; i--)
            result *= i;
        return result;
    }


    public int sum(int num) {
        int result;
        if (num == 1)
            return 1;
        else
            result = num + sum(num - 1);

        return result;
    }

    public int sumIteration(int num) {
        int result = 0;
        for (int i = num; i >= 1; i--) {
            result += i;
        }

        return result;
    }

    public int linearSum(int data[], int num) {
        if (num == 0)
            return data[num];
        else
            return linearSum(data, num - 1) + data[num];
    }


    public int linearSumIteration(int data[], int num) {

        int result = 0;
        for (int i = num; i >= 0; i--)
            result += data[i];
        return result;
    }

    public int recursivePower(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * recursivePower(x, n - 1);
    }


    public int recursivePowerIteration(int x, int n) {

        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= x;
        return result;
    }

    //    123456
    public int linearsumiteration(int[] data, int num) {
        int result = 0;
        for (int i = num; i >= 0; i++)
            result += data[i];
        return result;
    }

//    Function Enter Character and Hold Littele Position

    public boolean Little(int[] data,int num){
        boolean found = false;
        for(int i=0; i<data.length; i++){
            if(data[i] == num
            )
                found = true;

        }
            return found;
    }


//    value to entered index of
    public int index(int[] data,int num){
        int result = 0;
        for(int i=0; i<data.length; i++){
            if(data[i] == data[num])
                result += data[i];

        }
        return result;
    }




    public int stringLenth(String type) {
        int result = 0;
        for (int i = 1; i <= type.length();i++) {
            result += type.length();
            break;
        }

        return result;
    }



    public  int fib(int num){

        if(num<=1)
            return num;
        return fib(num-1) + fib(num -2);
    }




    public int stringLegth(String value){
        int lenth = 0;
        for(int i=0;i<value.length();i++)
            lenth++;
        return lenth;
    }















}



