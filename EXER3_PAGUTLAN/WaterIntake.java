public class WaterIntake {

    private String communityName;
    private int yearTarget;
    private double litersPerDay;

    public WaterIntake(String communityName, int yearTarget, double litersPerDay) {
        this.communityName = communityName;
        this.yearTarget = yearTarget;
        this.litersPerDay = litersPerDay;
    }

    public String getCommunityName() {
        return communityName;
    }

    public int getYearTarget() {
        return yearTarget;
    }

    public double getLitersPerDay() {
        return litersPerDay;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public void setYearTarget(int yearTarget) {
        this.yearTarget = yearTarget;
    }

    public void setLitersPerDay(double litersPerDay) {
        this.litersPerDay = litersPerDay;
    }
}