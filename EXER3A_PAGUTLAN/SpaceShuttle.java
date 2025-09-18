public class SpaceShuttle extends AirTransport {
    public SpaceShuttle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is launching into space.");
    }
}