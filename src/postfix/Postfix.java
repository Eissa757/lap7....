/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

/**
 *
 * @author Taif
 */
public class Postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        import java.util.Stack;
public class Postfix {
    // Java proram to evaluate value of a postfix expression
        // Method to evaluate value of a postfix expression
        static int evaluatePostfix(String exp)
        {
            //create a stack
            Stack<Integer> stack=new Stack<>();

            // Scan all characters one by one
            for(int i=0;i<exp.length();i++)
            {
                char c=exp.charAt(i);

                // If the scanned character is an operand (number here),
                // push it to the stack.
                if(Character.isDigit(c))
                    stack.push(c - '0');

                    // If the scanned character is an operator, pop two
                    // elements from stack apply the operator
                else
                {
                    int val1 = stack.pop();
                    int val2 = stack.pop();

                    switch(c)
                    {
                        case '+':
                            stack.push(val2+val1);
                            break;

                        case '-':
                            stack.push(val2- val1);
                            break;

                        case '/':
                            stack.push(val2/val1);
                            break;

                        case '*':
                            stack.push(val2*val1);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        // Driver program to test above functions
        public static void main(String[] args)
        {
            String exp="231*+9-";
            System.out.println("postfix evaluation: "+evaluatePostfix(exp));
        }
    }
    }
    
}
