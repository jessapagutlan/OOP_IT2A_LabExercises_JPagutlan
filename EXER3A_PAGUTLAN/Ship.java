public class Ship extends WaterTransport {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is transporting passengers.");
    }
}
