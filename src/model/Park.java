package model;

public class Park {
    private String vNo;
    private String type;
    private int slot;
    private String date;
    private String time;

    public Park() {
    }

    public Park(String vNo, String type, int slot, String date, String time) {
        this.vNo = vNo;
        this.type = type;
        this.slot = slot;
        this.date = date;
        this.time = time;
    }

    public String getvNo() {
        return vNo;
    }

    public void setvNo(String vNo) {
        this.vNo = vNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Park{" +
                "vNo='" + vNo + '\'' +
                ", type='" + type + '\'' +
                ", slot=" + slot +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

