package case_study_02.models;

public abstract class Service {
    String code;
    public String nameService;
    double area;
    double pay;
    int quantity;
    String typeRent;

    public Service(String code, String nameService, double area, double pay, int quantity, String typeRent) {
        this.code = code;
        this.nameService = nameService;
        this.area = area;
        this.pay = pay;
        this.quantity = quantity;
        this.typeRent = typeRent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfo();
}
