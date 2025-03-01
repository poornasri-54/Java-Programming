# Casting Incompatible Types

When we want to convert int value to a byte variable it is not possible to convert with automatic convertion because they violate the rules or conditions. Assigning larger data type value to smaller data type is possible by type casting.
**Type Casting**
An explicit type conversion.The Conversion between two incompatible types

* This kind of conversion is sometimes called a narrowing conversion, since you are explicitly making the value narrower,so that it will fit into the target type.

It has general form:
<center>(target-type)value</center>

```
int a;
byte b;
// conversion of int to byte
b = (byte) a;
```

A different type of conversion will occur when a floating-point value is assigned to an integer type: truncation

* when a floating-point value is assigned to an integer type, the fractional component is lost.

Example:

If the value 1.23 is assigned to an integer, the resulting value will simply be 1.
The 0.23 will have been truncated.
