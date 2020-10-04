package case_study_02.models;

public class Villa extends Service {
    String standardRoom;
    String ortherFacilities;
    double arePool;
    int amountFloor;

    public Villa(String code, String nameService, double area, double pay, int quantity,
                 String typeRent, String standardRoom, String ortherFacilities, double arePool, int amountFloor) {
        super(code, nameService, area, pay, quantity, typeRent);
        this.standardRoom = standardRoom;
        this.ortherFacilities = ortherFacilities;
        this.arePool = arePool;
        this.amountFloor = amountFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOrtherFacilities() {
        return ortherFacilities;
    }

    public void setOrtherFacilities(String ortherFacilities) {
        this.ortherFacilities = ortherFacilities;
    }

    public double getArePool() {
        return arePool;
    }

    public void setArePool(double arePool) {
        this.arePool = arePool;
    }

    public int getAmountFloor() {
        return amountFloor;
    }

    public void setAmountFloor(int amountFloor) {
        this.amountFloor = amountFloor;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "Ma dich vu: '" + code + '\'' +
                ", Ten dich vu: '" + nameService + '\'' +
                ", Tieu chuan phong: '" + standardRoom + '\'' +
                ", Mo ta dich vu: '" + ortherFacilities + '\'' +
                ", Dien tich ho boi: " + arePool +
                ", So luong tang: " + amountFloor +
                ", Dien tich: " + area +
                ", Chi phi thue: " + pay +
                ", So luong nguoi: " + quantity +
                ", Kieu thue: '" + typeRent + '\'' +
                '}';
    }

}
