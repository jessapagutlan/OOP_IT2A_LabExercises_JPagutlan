public class SUV extends LandTransport {
    public SUV(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is driving smoothly.");
    }
}