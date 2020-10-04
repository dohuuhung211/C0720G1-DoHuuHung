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
        return "Villa{" +
                "Ma dich vu: '" + code + '\'' +
                ", Ten dich vu: '" + nameService + '\'' +
                ", Dien tich: " + area +
                ", Chi phi thue: " + pay +
                ", So luong nguoi: " + quantity +
                ", Kieu thue: '" + typeRent + '\'' +
                ", Dich vu mien phi di kem: '" + servicesBonusFree + '\'' +
                '}';
    }
}
