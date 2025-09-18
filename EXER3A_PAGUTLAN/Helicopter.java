public class Helicopter extends AirTransport {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying low.");
    }
}