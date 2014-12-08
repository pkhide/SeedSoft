package Activity;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Activity {
    private String activityNum;
    private String activityName;
    private String activityType;
    private String activityTime;
    private String activityDate;
    private String activityRoom;
    private int activityCountMember;
    private int activityMaxNumber;
    private String description;
    private int activityPrice;

    public Activity(String activityNum, String activityName, String activityType, String activityTime, String activityDate, String activityRoom, int activityCountMember, int activityMaxNumber, String description, int activityPrice) {
        this.activityNum = activityNum;
        this.activityName = activityName;
        this.activityType = activityType;
        this.activityTime = activityTime;
        this.activityDate = activityDate;
        this.activityRoom = activityRoom;
        this.activityCountMember = activityCountMember;
        this.activityMaxNumber = activityMaxNumber;
        this.description = description;
        this.activityPrice = activityPrice;
    }


    public String getActivityNum() {
        return activityNum;
    }

    public void setActivityNum(String activityNum) {
        this.activityNum = activityNum;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime;
    }

    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public String getActivityRoom() {
        return activityRoom;
    }

    public void setActivityRoom(String activityRoom) {
        this.activityRoom = activityRoom;
    }

    public int getActivityCountMember() {
        return activityCountMember;
    }

    public void setActivityCountMember(int activityCountMember) {
        this.activityCountMember = activityCountMember;
    }

    public int getActivityMaxNumber() {
        return activityMaxNumber;
    }

    public void setActivityMaxNumber(int activityMaxNumber) {
        this.activityMaxNumber = activityMaxNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(int activityPrice) {
        this.activityPrice = activityPrice;
    }
}
