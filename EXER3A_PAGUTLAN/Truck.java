public class Truck extends LandTransport {
    public Truck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is carrying goods.");
    }
}