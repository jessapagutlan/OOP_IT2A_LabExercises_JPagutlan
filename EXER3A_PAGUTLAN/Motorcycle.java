public class Motorcycle extends LandTransport {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is speeding fast.");
    }
}