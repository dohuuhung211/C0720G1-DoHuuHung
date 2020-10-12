package abstract_test;

public class AbstractSecond implements Inter {


    @Override
    public void drink() {
        System.out.println("da khat");
    }

    @Override
    public void eat() {
        System.out.println("Ngon lam");
    }
    //    public AbstractSecond(int id, String name) {
//        super(id, name);
//    }


}
class Test{


    public static void main(String[] args) {
        AbstractSecond abstractSecond = new AbstractSecond();
        abstractSecond.eat();
        abstractSecond.drink();
        abstractSecond.run("Chay di");
    }
}
