/*Copyrights to venkys.io*/
/*For more programs visit venkys.io */
/*Java Program to understand local variables */

// Example 3
// Demonstrate name and roll number of a student

/*
A variable declared within a class outside any method constructor or block 
with static keyword is called class variable
*/

public class Class_variables_ex3 {
    static int roll_no;// class variable or static variable
    static String S_name = "vishnavi";// class variable

    public static void main(String[] args) {
        // accessing static variable
        Class_variables_ex3.roll_no = 3306;
        // display name and roll_no of a student
        System.out.println("studend name: " + Class_variables_ex3.S_name + " roll no:" + Class_variables_ex3.roll_no);
    }

}

/*
 * output:
 * studend name: vishnavi roll no:3306
 */
