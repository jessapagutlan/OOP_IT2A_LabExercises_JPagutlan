public class Airplane extends AirTransport {
    public Airplane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying high.");
    }
}
