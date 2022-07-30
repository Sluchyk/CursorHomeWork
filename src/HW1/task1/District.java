package HW1.task1;

public class District {
    private String districsName;
    private int  distance;
    public  District(String districsName,int distance)
    {
        this.districsName=districsName;
        this.distance=distance;
    }


    public String getDistricsName() {
        return districsName;
    }

    public void setDistricsName(String districsName) {
        this.districsName = districsName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


}
