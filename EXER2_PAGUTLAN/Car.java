public class Car {
    private String brand;
    private String color;
    private String plateNo;
    private String chassisNo;
    private String fuelType;
    private String seatsMaterial;     // New interior feature
    private String infotainmentSystem; // New interior feature
    private boolean airConditioning;   // New interior feature

    // Default constructor
    public Car() {
        this.brand = "No Brand";
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis Number Yet";
        this.fuelType = "No Fuel Type";
        this.seatsMaterial = "No Seats Material";
        this.infotainmentSystem = "No Infotainment System";
        this.airConditioning = false;
    }

    // Parameterized constructor
    public Car(String brand, String color, String plateNo, String chassisNo, String fuelType, 
               String seatsMaterial, String infotainmentSystem, boolean airConditioning) {
        this.brand = brand;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.fuelType = fuelType;
        this.seatsMaterial = seatsMaterial;
        this.infotainmentSystem = infotainmentSystem;
        this.airConditioning = airConditioning;
    }

    // Method to display car information
    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand + "\n";
        info += "Color: " + this.color + "\n";
        info += "PlateNo: " + this.plateNo + "\n";
        info += "ChassisNo: " + this.chassisNo + "\n";
        info += "FuelType: " + this.fuelType + "\n";
        info += "Seats Material: " + this.seatsMaterial + "\n";
        info += "Infotainment System: " + this.infotainmentSystem + "\n";
        info += "Air Conditioning: " + (this.airConditioning ? "Yes" : "No") + "\n";
        System.out.println("-----------------------");
        System.out.print(info);
    }

    // Main method
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Yellow", "KAW12345", "AB123", "Gasoline", "Leather", "Touchscreen", true);
        Car c2 = new Car("Toyota", "Red", "XYZ5678", "CD456", "Diesel", "Fabric", "Standard", true);
        Car c3 = new Car("Honda", "Blue", "LMN9101", "EF789", "Hybrid", "Leather", "Touchscreen", true);
        Car c4 = new Car("BMW", "Black", "QRS2345", "GH012", "Gasoline", "Alcantara", "Premium Sound", true);
        Car c5 = new Car("Mitsubishi", "White", "TUV6789", "IJ345", "Electric", "Cloth", "Standard", false);
        Car c6 = new Car("Chevrolet", "Silver", "CHE1234", "KL678", "Gasoline", "Leather", "Touchscreen", true);
        Car c7 = new Car("Nissan", "Green", "NIS5678", "MN890", "Gasoline", "Fabric", "Standard", false);
        Car c8 = new Car("Hyundai", "Orange", "HYU9101", "OP234", "Hybrid", "Leather", "Touchscreen", true);
        Car c9 = new Car("Kia", "Brown", "KIA2345", "QR567", "Diesel", "Cloth", "Basic", false);
        Car c10 = new Car("Mercedes", "Gray", "MER6789", "ST890", "Gasoline", "Leather", "Premium Sound", true);

        // Display information for all cars
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        c4.displayInfo();
        c5.displayInfo();
        c6.displayInfo();
        c7.displayInfo();
        c8.displayInfo();
        c9.displayInfo();
        c10.displayInfo();
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }
}
