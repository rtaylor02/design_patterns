package Behavioural.Iterator.example1;

public class Client {
    public static void main(String[] args) {
        Department arts = new ArtsDepartment();
        Iterator artsIterator = arts.createIterator();
        while(artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }
        artsIterator.first();
        System.out.println("Moving pointer back to first subject: " + artsIterator.current());
    }
}
