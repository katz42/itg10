package main.java.ezhidkova.week07;

import java.util.Stack;

public class brackets {
    public static boolean validCheck(String stringExample){
        Stack<Character> bracketsStack = new Stack<>();
        for (char c : stringExample.toCharArray()) { // преобразование строки в символы
            switch (c){
                case '(', '{', '[':
                    bracketsStack.push(c);
                    break;
                case ')':
                    if (!bracketsStack.empty() && bracketsStack.peek() == '('){
                        bracketsStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!bracketsStack.empty() && bracketsStack.peek() == '{'){
                        bracketsStack.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (!bracketsStack.empty() && bracketsStack.peek() == '['){
                        bracketsStack.pop();
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return bracketsStack.isEmpty();
    }

    public static void main(String[] args){
        String one = "([)]";
        String two = "(]";
        String three = "(){}[]";
        String four = "()";
        System.out.println(validCheck(one));
        System.out.println(validCheck(two));
        System.out.println(validCheck(three));
        System.out.println(validCheck(four));
    }
}





    /**
    public static void main(String[] args) {

        Stack<String> bracketsExample = new Stack<>();
        bracketsExample.push("{");
        bracketsExample.push("[");
        bracketsExample.push("(");
        bracketsExample.push(")");
        bracketsExample.push("}");

        Object[] bracketsExampleArray = bracketsExample.toArray();

        System.out.println("The array is:");
        for (int i = 0; i < bracketsExampleArray.length; i++)
            System.out.println(bracketsExampleArray[i]);

        int bracket = 1;
    }

}
     **/