# Factory Method

## Problem It Solves
When you need different implementation for each child.

## Formula
1. Parent: Abstract factory method
2. Parent: Call to the factory method
3. Child: concrete implementation of the abstract factory method

## Example
```sh
public class MyClass {
    public static void main(String args[]) {
      UserPrefs userPrefs1 = UserPrefs.get();
      userPrefs1.setColour("Red");
      
      UserPrefs userPrefs2 = UserPrefs.get();
      userPrefs2.setColour("Green");
      
      System.out.println(userPrefs1.getColour() + " " + userPrefs2.getColour());
    }
}

class UserPrefs {
    private static UserPrefs u;
    private String colour;
    
    private UserPrefs() {
        
    }
    
    public static UserPrefs get() {
        if (u == null) {
            u = new UserPrefs();
        }
        return u;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return this.colour;
    }
}
```
