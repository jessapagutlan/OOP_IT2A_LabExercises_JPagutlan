public class CommercialUsage extends WaterUsage {
    private String businessName;
    private String areaSize;

    public CommercialUsage(String activityType, double waterUsedInLiters, String businessName, String areaSize) {
        super(activityType, waterUsedInLiters);
        this.businessName = businessName;
        this.areaSize = areaSize;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getAreaSize() {
        return areaSize;
    }
}