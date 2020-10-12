package abstract_test;

public interface Interface {
    void eat();
}
interface Inter extends Interface{
    void drink();
    default String run(String x){
        System.out.println(x);
        return x;
    }
}
