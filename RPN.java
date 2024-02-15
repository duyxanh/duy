
package lab03_duyanhng_haluu;

//3-4

public class RPN {
    public int evaluate(String expression) {
        Stack<String> stack = new Stack<>(); //create a stack to keep track of operands and update the results
        String[] words = expression.split(" ");
        for (String word : words) {
            if (word.equals("+")) { // if +
                int a = Integer.parseInt(stack.pop()); //turn the number in the stack to an integer
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b+a)); // add them together
            } else if (word.equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b-a));
            } else if (word.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b*a));
            } else if (word.equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b/a));
            } else {
                // word is a "number"
                stack.push(word);
            }
        }
        // last remaining number of stack
        int res = Integer.parseInt(stack.pop());
        return res;
    }

    public static void main(String[] args) {
        RPN rpn = new RPN();
        System.out.println(rpn.evaluate("3 5 +"));
        System.out.println(rpn.evaluate("7 5 -"));
        System.out.println(rpn.evaluate("3 5 + 7 5 - *"));
        System.out.println(rpn.evaluate("2 2 3 * +"));
        System.out.println(rpn.evaluate("2 2 * 3 +"));
        System.out.println(rpn.evaluate("2 2 3 - 5 + *"));
    }
}
