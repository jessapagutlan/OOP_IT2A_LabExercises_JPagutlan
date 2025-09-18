public class AirTransport extends Transportation {
    public AirTransport(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies in the sky.");
    }
}