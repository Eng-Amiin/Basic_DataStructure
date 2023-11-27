package Recursion;

public class Main {
    public static void main(String[] args) {
        Recursion re = new Recursion();
//        int result = re.Fact(5);

//        System.out.println("The result Is : " + result);
//
//
//
////        int score = re.Sum(5);
//        System.out.println("The result Is : " + result);
        int data[] = {2,4,1,4,7,9,7};
        System.out.println("Waa "+re.fib(12));

//        System.out.println("The Sum Is " + re.linearSum(data,5));
//        System.out.println("POwer Is " + re.recursivePower(4,4));
//        System.out.println("Fac" + re.Fact(5));
//        System.out.println("the lenear sum" + re.linearSumIteration(data,5));
//        System.out.println("The Power Is " + re.recursivePowerIteration(4,4));

//        System.out.println("Factorial Is " + re.factorial(3));
//        System.out.println("Factorial Iteration Is " + re.factorialIteration(6));
//        System.out.println("Sum Is "+ re.sum(20));
//        System.out.println("Sum Iteration Is "+ re.sumIteration(20));
//        System.out.println("LinearSum Is " + re.linearSum(data,5));
//        System.out.println("LinearSumIteration is " + re.linearSumIteration(data,5));
//        System.out.println("RecursivePower is " + re.recursivePower(5,5));
//        System.out.println("RecursivePowerIteration Is " + re.recursivePowerIteration(5,5));
//        System.out.println("Amiin Test " + re.linearsumiteration(dat,5));
//        String search = re.search("CA202");
//        System.out.println("Search is :" + re.search("CA202"));
//
//        String names [] = {"Mohamed"};
//        String name = ("Mohamed");
//        System.out.println("Littele is " + re.little(names,0));
//        System.out.println(re.returnIndexName(name,0));
//        System.out.println(" Waa " + re.stringLenth("Mohamed abdi"));
//        System.out.println("Littele " + re.Little(data,2));


       // System.out.println("Index Of " + re.index(data,7));
//        var test= new int[]{20,30,40};
//        System.out.println(linearec(test,30,2,3));
    }


    public  static boolean linearec(int[] data,int target,int size){
        if(size-1<0)
            return false;
        if(size>data.length)
            return false;
        if(data[size-1]==target)
            return true;

        return  linearec(data,target,size-1);
    }

    public  static boolean linearec(int[] data,int target,int min,int max){
        if(max>=data.length)
            return false;
      if(min>max)
          return false;
      if(data[min]==target)
          return true;
      return linearec(data,target,min+1,max);
    }


}
