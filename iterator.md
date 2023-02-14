# Factory Method

## Problem It Solves
When we want to iterate over elements of an aggregate object (array, collection, etc).

## Formula
1. Subjects and observers have their respective parent interface
2. Concrete subjects and observers have reference to each other as private field with parent interface as type
3. Subject interface has notify(); Observer interface has update()
4. Concrete subjects and observers have common field of interest that gets notified (by subjects) and updated (by observers)

## Example
```sh
public class TestDrive {
    public static void main(String args[]) {
      
    }
}

```
