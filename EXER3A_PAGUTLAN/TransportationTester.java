public class TransportationTester {
    public static void main(String[] args) {
        Transportation[] transports = {
            new Helicopter("Helicopter"),
            new Airplane("Airplane"),
            new SpaceShuttle("Space Shuttle"),
            new Truck("Truck"),
            new SUV("SUV"),
            new Tricycle("Tricycle"),
            new Motorcycle("Motorcycle"),
            new Kariton("Kariton"),
            new Boat("Boat"),
            new Ship("Ship")
        };

        for (Transportation t : transports) {
            t.move();
        }
    }
}