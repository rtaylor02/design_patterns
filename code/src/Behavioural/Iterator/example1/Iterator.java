package Behavioural.Iterator.example1;

public interface Iterator {
    void first();
    String next();
    String current();
    boolean hasNext();
}

class ArtsIterator implements Iterator {
    private String[] subjects;
    private int currentPointer;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public void first() {
        currentPointer = 0;
    }

    @Override
    public String next() {
        return subjects[currentPointer++];
    }

    @Override
    public String current() {
        return subjects[currentPointer];
    }

    @Override
    public boolean hasNext() {
        if(currentPointer < subjects.length) {
            return true;
        }
        return false;
    }
}
