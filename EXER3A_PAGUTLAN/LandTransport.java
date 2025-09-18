public class LandTransport extends Transportation {
    public LandTransport(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on the road.");
    }
}
