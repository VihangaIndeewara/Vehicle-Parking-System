package views.TM;

public class DeliveryTM {
     private String vNo;
     private String type;
     private String dName;
     private String date;
     private String time;

    public DeliveryTM(String vNo, String type, String dName, String date, String time) {
        this.vNo = vNo;
        this.type = type;
        this.dName = dName;
        this.date = date;
        this.time = time;
    }

    public DeliveryTM() {
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

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
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
        return "DeliveryTM{" +
                "vNo='" + vNo + '\'' +
                ", type='" + type + '\'' +
                ", dName='" + dName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
