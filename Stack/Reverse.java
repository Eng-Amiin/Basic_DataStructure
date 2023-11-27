package Stack;

import java.util.Stack;

public class Reverse {

//    Method
   Stack<Character> st = new Stack<>();
    public String reverse(String input){


        for(int i=0; i<input.length(); i++)
            st.push(input.charAt(i));

        StringBuffer refersed = new StringBuffer("");
        while (!st.empty()){
            refersed.append(st.pop());
        }
        return refersed.toString();
    }





    }











