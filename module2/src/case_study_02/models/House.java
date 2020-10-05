package case_study_02.models;

public class House extends Service {
    String standardRoom;
    String ortherFacilities;
    int amountFloor;

    public House(String code, String nameService, double area, double pay, int quantity, String typeRent,
                 String standardRoom, String ortherFacilities, int amountFloor) {
        super(code, nameService, area, pay, quantity, typeRent);
        this.standardRoom = standardRoom;
        this.ortherFacilities = ortherFacilities;
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
        return "House: " + "\n" +
                "Ma dich vu: " + code + "\n" +
                "Ten dich vu: " + nameService + "\n" +
                "Tieu chuan phong: " + standardRoom + "\n" +
                "Mo ta dich vu: " + ortherFacilities + "\n" +
                "So luong tang: " + amountFloor + "\n" +
                "Dien tich: " + area + "\n" +
                "Chi phi thue: " + pay + "\n" +
                "So luong nguoi: " + quantity + "\n" +
                "Kieu thue: " + typeRent;
    }
}
