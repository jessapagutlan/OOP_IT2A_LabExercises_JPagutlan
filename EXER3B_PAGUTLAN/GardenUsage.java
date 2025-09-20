public class GardenUsage extends WaterUsage {
    private String plantType;
    private String wateringMethod;

    public GardenUsage(String activityType, double waterUsedInLiters, String plantType, String wateringMethod) {
        super(activityType, waterUsedInLiters);
        this.plantType = plantType;
        this.wateringMethod = wateringMethod;
    }

    public String getPlantType() {
        return plantType;
    }

    public String getWateringMethod() {
        return wateringMethod;
    }
}