package cn.hp.model;

public class Business {
    private int bId;
    private String bNum;
    private String bType;
    private String bMark;

    public Business() {
    }

    public int getbId() {
        return bId;
    }

    @Override
    public String toString() {
        return "Business{" +
                "bId=" + bId +
                ", bNum='" + bNum + '\'' +
                ", bType='" + bType + '\'' +
                ", bMark='" + bMark + '\'' +
                '}';
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbNum() {
        return bNum;
    }

    public void setbNum(String bNum) {
        this.bNum = bNum;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getbMark() {
        return bMark;
    }

    public void setbMark(String bMark) {
        this.bMark = bMark;
    }

    public Business(int bId, String bNum, String bType, String bMark) {
        this.bId = bId;
        this.bNum = bNum;
        this.bType = bType;
        this.bMark = bMark;
    }
}
