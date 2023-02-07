package Behavioural.Strategy.example1;

public class TestDrive {
    public static void main(String[] args) {
        // Use one algorithm in one calculation
        BiggerAlgorithm biggerAlgorithm1 = new BiggerAlgorithm(new Algorithm1());

        // Use another algorithm in different calculation
        BiggerAlgorithm biggerAlgorithm2 = new BiggerAlgorithm(new Algorithm2());
    }
}

abstract class Algorithm {
    public abstract void sort();
}

class Algorithm1 extends Algorithm {
    @Override
    public void sort() {
        System.out.println("Algorithm 1...");
    }
}

class Algorithm2 extends Algorithm {
    @Override
    public void sort() {
        System.out.println("Algorithm 2...");
    }
}

class BiggerAlgorithm {
    private Algorithm algo;

    public BiggerAlgorithm(Algorithm algorithmToUse) {
        this.algo = algorithmToUse;
    }
}
