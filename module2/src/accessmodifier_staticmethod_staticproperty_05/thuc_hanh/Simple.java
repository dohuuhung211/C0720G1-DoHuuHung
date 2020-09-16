package accessmodifier_staticmethod_staticproperty.thuc_hanh;

public class Simple {
    public static void main(String[] args) {
        AccessModifer obj = new AccessModifer();
        System.out.println(obj.data);
        obj.msg();

        AccessModifer obj1 = new AccessModifer();
        obj1.msg1();

        AccessModifer obj3 = new AccessModifer();
        obj3.msg3();
    }
}
class B extends AccessModifer{
    public static void main(String[] args) {
        B obj2 = new B();
        obj2.msg2();
    }
}
