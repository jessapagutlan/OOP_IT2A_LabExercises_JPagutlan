public class Tricycle extends LandTransport {
    public Tricycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving slowly.");
    }
}

