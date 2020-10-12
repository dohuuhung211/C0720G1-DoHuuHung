package case_study_02.models;

public class BonusService {
    String freeBonusService;
    public BonusService(){}
    public BonusService(String freeBonusService) {
        this.freeBonusService = freeBonusService;
    }

    public String getFreeBonusService() {
        return freeBonusService;
    }

    public void setFreeBonusService(String freeBonusService) {
        this.freeBonusService = freeBonusService;
    }

    @Override
    public String toString() {
        return freeBonusService;

    }
}
