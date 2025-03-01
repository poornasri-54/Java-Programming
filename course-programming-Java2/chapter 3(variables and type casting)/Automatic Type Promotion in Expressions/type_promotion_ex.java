/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java Program to understand type Promotion*/

// Example 1
// Demonstrate promotion in expression

/*
Using type promotion rules demonstrating type promotion in expression 
*/
public class type_promotion_ex {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}

/*
 * output
 * 283.18 + 515 - 126.3616
 * result = 626.7784146484375
 */
