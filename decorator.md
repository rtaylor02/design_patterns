# Factory Method

## Problem It Solves
When we introduce a new behaviour on top of existing behaviours. This is a true embodiment of the principle: 
favour composition over inheritance.

## Formula
1. 1 master super class/interface for all
2. Additional behaviour class:
   a. extends master super class 
   b. makes abstract the master's behaviour that it wants to 'decorate'

## Example
```sh
public class TestDrive {
    public static void main(String args[]) {
      
    }
}

```
