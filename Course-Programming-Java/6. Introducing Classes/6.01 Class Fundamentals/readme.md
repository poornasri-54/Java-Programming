# Class Fundamentals
- Perhaps the most important thing to understand about a class is that it defines a new 
data type. Once defined, this new type can be used to create objects of that type.
- Thus, a class is a template for an object, and an object is an instance of a class. Because an object is 
an instance of a class, you will often see the two words object and instance used interchangeably.

## General Form of a Class

- A class is declared by use of the class keyword. The classes that have been used up to this 
point are actually very limited examples of its complete form. Classes can (and usually do) 
get much more complex.
- A simplified general form of a class definition is shown here:


```
class classname  { 
type instance-variable1; 
    type instance-variable2; 
    // ... 
    type instance-variableN; 
    type methodname1(parameter-list) { 
      // body of method 
    } 
  type methodname2(parameter-list) { 
      // body of method 
    } 
    // ... 
    type methodnameN(parameter-list) { 
        // body of method 
    } 
} 
```
## 1. Class Declaration:
 - It begins with the keyword "class" followed by the name of the class. For example:
 ```
 public class MyClass {
```
## 2. Class Modifiers:
-  These are optional keywords that modify the access and behavior of the class.
- The most common modifiers are "public" and "private," but there are others like "abstract," "final," etc.

## 3. Class attributes:
- These are variables or data members that define the properties of the class. They can be either instance variables (specific to each object of the class) or class variables (shared among all objects of the class).

- Attributes are defined within the class body. For example:
```
 private int instanceVariable;
 public static int classVariable;
 ```

## 4. Constructors:
- They are special methods called when an object is created from the class. Constructors have the same name as the class and may have parameters for initializing the object's attributes. For example:

```
 public MyClass() {
        // Constructor without parameters
    }

    public MyClass(int value) {
        // Constructor with a parameter
        instanceVariable = value;
    }
```

## 5.Methods:
- These are functions defined within the class that define the behavior and actions of the class.
- Methods can operate on class attributes and perform various tasks. For example:

```
 public void myMethod() {
        System.out.println("This is a method.");
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }
```

# Simple Class
- Here's an example of a simple class in Java that represents a Person:

```
public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John", 25);

        // Access instance variables using getters
        String name = person.getName();
        int age = person.getAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Modify instance variables using setters
        person.setName("Jane");
        person.setAge(35);

        // Call the introduce() method
        person.introduce();
    }
}
```

- In this example, the Person class has two private instance variables: name of type String and age of type int.
- It also has a constructor that takes parameters to initialize the name and age of a Person object.

- The class includes getter and setter methods (getName(), getAge(), setName(), setAge()) to access and modify the instance variables.

- Lastly, there's a method called introduce() that prints a simple introduction message using the name and age of the person.



