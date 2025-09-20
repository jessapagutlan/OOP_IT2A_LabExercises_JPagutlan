public class HomeUsage extends WaterUsage {
    private String householdMember;
    private int durationInMinutes;

    public HomeUsage(String activityType, double waterUsedInLiters, String householdMember, int durationInMinutes) {
        super(activityType, waterUsedInLiters);
        this.householdMember = householdMember;
        this.durationInMinutes = durationInMinutes;
    }

    public String getHouseholdMember() {
        return householdMember;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}