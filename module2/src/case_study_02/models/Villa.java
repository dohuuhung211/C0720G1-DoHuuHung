package case_study_02.models;

public class Villa extends Service implements Comparable<Villa>{
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
        return this.toString();
    }


    @Override
    public String toString() {
        return "Villa: " + "\n" +
                "Ma dich vu: " + code + "\n" +
                "Ten dich vu: " + nameService + "\n" +
                "Tieu chuan phong: " + standardRoom + "\n" +
                "Mo ta dich vu: " + ortherFacilities + "\n" +
                "Dien tich ho boi: " + arePool + "\n" +
                "So luong tang: " + amountFloor + "\n" +
                "Dien tich: " + area + "\n" +
                "Chi phi thue: " + pay + "\n" +
                "So luong nguoi: " + quantity + "\n" +
                "Kieu thue: " + typeRent;
    }

    @Override
    public int compareTo(Villa villa) {
        return this.getNameService().compareTo(villa.getNameService());
    }
}
