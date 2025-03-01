# Automatic conversion

One type of data is assigned to another type of variable, an automatic type conversion takes will take space if the following contions are satisfied

* the two types should be compatable.
* the destination type should be larger than source type.

When these two conditions are satisfied, a **widening conversion** takes place.

**Example**

The int type is always large enough to hold all valid byte values, so no explicit cast statement is required.

* conversion of int to float

```
int i = 100;
float f = l;
Float value 100.0
```

There is an order for widening conversion

<p style="text-align: center;">Byte--Short--Int--Long--Float--Double</p>

* The numeric types, including integer and floating-point types, are compatible with each other.

* There are no automatic conversions from the numeric types to char or boolean. Also, char and boolean are not compatible with each other.
