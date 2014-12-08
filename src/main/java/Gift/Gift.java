package Gift;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Gift {
    private String giftNum;
    private String giftName;
    private int giftPoint;

    public Gift(String giftNum, String giftName, int giftPoint) {
        this.giftNum = giftNum;
        this.giftName = giftName;
        this.giftPoint = giftPoint;
    }

    public String getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(String giftNum) {
        this.giftNum = giftNum;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public int getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(int giftPoint) {
        this.giftPoint = giftPoint;
    }
}
