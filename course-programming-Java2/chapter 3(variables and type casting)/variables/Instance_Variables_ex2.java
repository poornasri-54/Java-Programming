/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java Program to understand local variables */

// Example 2
// Demonstrate height of an animal

// A variable declared within a class outside any method constructor or block is called instance variable 
public class Instance_Variables_ex2 {
    int height = 10; // instance variable
    // height of an animal

    public static void main(String[] args) {
        System.out.println("displaying instance variable");
        Instance_Variables_ex2 ins = new Instance_Variables_ex2();
        System.out.println("height : " + ins.height);
    }
}
/*
 * output:
 * displaying instance variable
 * height : 10
 */
