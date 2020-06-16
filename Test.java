# 2020_6-16_CodePractice

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object o=new Object();
        Test o1=new Test();
        o.wait();
        o.wait(200);
        o.wait(200,1);
        o.notify();
        o.notifyAll();
        o.equals(o1);
        o.hashCode();
        o.toString();
        o.getClass();
       // Object类除了以上9种方法还有finalize()和clone()两个方法
        // 因为这两个方法是由protected修饰符修饰的,只能在java.lang.Object;
        // 本类、同包类或者在不同包的子类里调用 ;
        //这里直接用引用o调用它们会报错;
    }
}
