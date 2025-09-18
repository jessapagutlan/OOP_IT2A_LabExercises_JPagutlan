public class Boat extends WaterTransport {
    public Boat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is sailing.");
    }
}