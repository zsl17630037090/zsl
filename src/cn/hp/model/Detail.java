package cn.hp.model;

public class Detail {
    private int bdId;
    private int bId;
    private String bdName;
    private String bdPerson;

    public Detail() {
    }

    public int getBdId() {
        return bdId;
    }

    public void setBdId(int bdId) {
        this.bdId = bdId;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getBdName() {
        return bdName;
    }

    public void setBdName(String bdName) {
        this.bdName = bdName;
    }

    public String getBdPerson() {
        return bdPerson;
    }

    public void setBdPerson(String bdPerson) {
        this.bdPerson = bdPerson;
    }

    public Detail(int bdId, int bId, String bdName, String bdPerson) {
        this.bdId = bdId;
        this.bId = bId;
        this.bdName = bdName;
        this.bdPerson = bdPerson;
    }
}
