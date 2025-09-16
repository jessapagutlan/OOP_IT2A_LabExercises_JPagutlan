public class Main {
    public static void main(String[] args) {

        WaterIntake water = new WaterIntake("Barangay Matiao", 2026, 50.0);

        System.out.println("Community: " + water.getCommunityName());
        System.out.println("Target Year: " + water.getYearTarget());
        System.out.println("Safe Water Access per Person: " + water.getLitersPerDay() + " liters/day");

        water.setLitersPerDay(75.0);
        System.out.println("\n[Updated Data]");
        System.out.println("Safe Water Access per Person: " + water.getLitersPerDay() + " liters/day");
    }
}
