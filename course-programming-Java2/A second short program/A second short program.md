# A second short program
- A variable is a very fundamental and important concept for every programming language
- A variable is a named memory location that is assigned a value by the program that can be changed at the time of execution
- lets take a close look at the concept of variable
```
class example1{
    public static void main(String[] args){
        int n;  // this declares a variable called n
        n=100; // this assigns n the value 100
        System.out.println("the value of n is:"+n);
        n=n+100;
        System.out.println("new value of n after altering is:"+n);
    }
}
```
```
output : the value of n is:100
         new value of n after altering is:200
```
- int n;  // this declares a variable called n
   - This line declares a variable n with its datatype integer
   - syntax of declaring a variable is **datatype var_name;**
- n=100; // this assigns n the value 100
   - This assigns vlaue 100 to the variable n
   - syntax of assigning a value to a variable (initializing) is **var_name=value**
   - here "=" is an assigning operator
- System.out.println("the value of n is:"+n);
   - Here '+' plus operator is used to concatenate as many items as required within a silgle print() statment
   - In the above line the value of the variable is first converted to a string and then concatenated to the preceeding string and then outputs the string on the console
- n=n+100;
   - Here the value of n is altered or updated by adding the value of n and 100
- System.out.println("new value of n after altering is:"+n);
   - Here the updated value of n is first converted into a string and and concatenated with the preceding string in double cotations and printed on the console
