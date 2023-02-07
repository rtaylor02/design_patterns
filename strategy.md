# Factory Method

## Problem It Solves
When we have different algorithms in different situations. For

## Formula
1. One parent strategy interface
2. Several child strategy classes
3. Client uses the strategy child classes via polymorphism

## Example
```sh
public class TestDrive {
    public static void main(String args[]) {
      UserPrefs userPrefs1 = UserPrefs.get();
      userPrefs1.setColour("Red");
      
      UserPrefs userPrefs2 = UserPrefs.get();
      userPrefs2.setColour("Green");
      
      System.out.println(userPrefs1.getColour() + " " + userPrefs2.getColour());
    }
}

// SortAlgo can also be an interface.
abstract class SortAlgo {
    public abstract void sort();
}

public class BubbleSort extends SortAlgo {
    public void sort() {}
}
```
