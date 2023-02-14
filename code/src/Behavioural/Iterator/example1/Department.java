package Behavioural.Iterator.example1;

public interface Department {
    Iterator createIterator();
}

class ArtsDepartment implements Department {
    private String[] subjects = {
            "1. English",
            "2. History",
            "3. Geography",
            "4. Psychology",
    };

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
