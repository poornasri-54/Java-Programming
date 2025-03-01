/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java Program to understand type conversion */

// Example 1
// Demonstrate casting

/*
type casting: To create a conversion between two incompatible types
It has general form:
(target-type) value
*/
public class conversion_ex1 {
    public static void main(String[] args) {
        byte b;
        float f = (float) 66.88;
        double d = 323.142;
        System.out.println("\nConversion of float to byte.");
        b = (byte) f;
        System.out.println("f and b " + f + " " + b);
        System.out.println("\nConversion of double to int.");
        f = (int) d;
        System.out.println("d and f " + d + " " + f);
        System.out.println("\nConversion of double to byte.");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);

    }
}
/*
 * output
 * Conversion of int to byte.
 * f and b 66.88 66
 * Conversion of double to int.
 * d and f 323.142 323.0
 * Conversion of double to byte.
 * d and b 323.142 67
 */

/*
 * when the value of 66.88 is cast into a byte variable the result is 66 (it is
 * in range of byte)
 * When the d is converted to an float, its fractional component is lost and
 * default factional component of float is assigned that is 323.0
 * When d is converted to a byte, its fractional component is lost, and the
 * value is reduced modulo 256, which in this case is 67
 */
