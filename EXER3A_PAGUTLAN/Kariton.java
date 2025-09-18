public class Kariton extends LandTransport {
    public Kariton(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is being pushed by hand.");
    }
}