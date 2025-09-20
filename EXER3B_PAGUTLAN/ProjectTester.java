public class ProjectTester {
    public static void main(String[] args) {
        // Create an instance of HomeUsage
        HomeUsage homeUsage = new HomeUsage("Shower", 75.0, "Juan", 10);

        // Create an instance of GardenUsage
        GardenUsage gardenUsage = new GardenUsage("Watering Plants", 20.0, "Tomato", "Sprinkler");

        // Create an instance of CommercialUsage
        CommercialUsage commercialUsage = new CommercialUsage("Restaurant Operation", 500.0, "Jollibee", "500 sq. m");

        // Display details of each instance
        System.out.println("Home Usage Tracker:");
        System.out.println("Activity: " + homeUsage.getActivityType());
        System.out.println("Water Used: " + homeUsage.getWaterUsedInLiters() + " liters");
        System.out.println("Member: " + homeUsage.getHouseholdMember());
        System.out.println("Duration: " + homeUsage.getDurationInMinutes() + " minutes");

        System.out.println("\n---------------------\n");

        System.out.println("Garden Usage Tracker:");
        System.out.println("Activity: " + gardenUsage.getActivityType());
        System.out.println("Water Used: " + gardenUsage.getWaterUsedInLiters() + " liters");
        System.out.println("Plant Type: " + gardenUsage.getPlantType());
        System.out.println("Method: " + gardenUsage.getWateringMethod());

        System.out.println("\n---------------------\n");

        System.out.println("Commercial Usage Tracker:");
        System.out.println("Activity: " + commercialUsage.getActivityType());
        System.out.println("Water Used: " + commercialUsage.getWaterUsedInLiters() + " liters");
        System.out.println("Business: " + commercialUsage.getBusinessName());
        System.out.println("Area: " + commercialUsage.getAreaSize());
    }
}