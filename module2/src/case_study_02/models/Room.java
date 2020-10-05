package case_study_02.models;

public class Room extends Service{
    String servicesBonusFree;

    public Room(String code, String nameService, double area, double pay,
                int quantity, String typeRent, String servicesBonusFree) {
        super(code, nameService, area, pay, quantity, typeRent);
        this.servicesBonusFree = servicesBonusFree;
    }

    public String getServicesBonusFree() {
        return servicesBonusFree;
    }

    public void setServicesBonusFree(String servicesBonusFree) {
        this.servicesBonusFree = servicesBonusFree;
    }

    @Override
    public String showInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Room: " + "\n" +
                "Ma dich vu: " + code + "\n" +
                "Ten dich vu: " + nameService + "\n" +
                "Dien tich: " + area + "\n" +
                "Chi phi thue: " + pay + "\n" +
                "So luong nguoi: " + quantity + "\n" +
                "Kieu thue: " + typeRent + "\n" +
                "Dich vu mien phi di kem: " + servicesBonusFree;
    }
}
