public class WaterTransport extends Transportation {
    public WaterTransport(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " sails on the water.");
    }
}