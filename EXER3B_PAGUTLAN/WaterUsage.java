public class WaterUsage {
    private String activityType;
    private double waterUsedInLiters;

    public WaterUsage(String activityType, double waterUsedInLiters) {
        this.activityType = activityType;
        this.waterUsedInLiters = waterUsedInLiters;
    }

    public String getActivityType() {
        return activityType;
    }

    public double getWaterUsedInLiters() {
        return waterUsedInLiters;
    }
}