/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java Program to understand local variables */

// Example 1
// Demonstrate block scope

// A variable declared within a block is called a local variable.

public class Local_variables_ex1 {
    public static void calculate(int x, int y) {
        x = x + 5;
        y = y - 7;
        // Print statement
        System.out.println("the value of x :" + x);
        System.out.println("the value of y :" + y);
    }

    public static void main(String[] args) {
        int h = 80;
        int b = 20;

        calculate(h, b);

        System.out.println("value of h: " + h);
        System.out.println("value of b: " + b);
    }

}
/*
 * output:
 * the value of x :85
 * the value of y :13
 * value of h: 80
 * value of b: 20
 */

/*
 * changes in the values of x and y are not reflected h and b because x and y
 * are formal parameters and are local to caluclate method so any changes in
 * their values here won’t affect variables
 * a and b inside the main.
 */
