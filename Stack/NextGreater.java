package Stack;

import java.util.Objects;
import java.util.Stack;

public class NextGreater {
   static  Stack<Integer> stack= new Stack<>();
    public static void main(String[] args) {

        stack.push(10);
        stack.push(2);
        stack.push(19);


//        NextGreaterElement(stack);
//        Min(stack);
        System.out.println("___________");
        System.out.println(searchStack(10));;


    }

    static void NextGreaterElement(Stack<Integer> stack){
        int next;
        for(int i=0; i<stack.size(); i++){
            next = -1;
            for(int j = i+1; j<stack.size(); j++){
                if(stack.get(i) < stack.get(j))
                    next = stack.get(j);
            }
            System.out.println(stack.get(i) + " -----> " + next);
        }
    }


     static  int searchStack( int element) {
        int index=1;
        boolean isfound=false;
        for (var e : stack){
            if(e == element)
            {
                isfound=true;
                break;
            }
            index++;
        }
        return (isfound) ? index : -1;
    }

//    static void Min(Stack<Integer> stack){
//        int min = 0;
//        for(int i =0; i<stack.size(); i++){
//            for(int j = i+1; j<stack.size(); j++){
//                if(stack.get(i) < stack.get(j))
//                    min = stack.get(j);
//                10 < 2 false
//                        2 < 18 true
//                                18 < -1 false
//            }
//            System.out.println("The Stack Of The These Three Numbers Are " + min);
//        }
//
//    }
}
