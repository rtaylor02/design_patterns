package Behavioural.Adapter.example1;

/*
Adapter pattern:
1) The adapter IMPLEMENTS the interface that the client is using. In this case, Duck interface.
2) The adapter HAS AN object of the adaptee type.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
