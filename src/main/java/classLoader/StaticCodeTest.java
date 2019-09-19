package classLoader;

public class StaticCodeTest {

    static{
        //System.out.println("静态代码块执行中_____x值为:"+x);
        x=100;
    }

    static int x=200;

    public static void main(String[] args) {
        StaticCodeTest s=new StaticCodeTest();
        System.out.println("类初始化后的x的值为:"+x);

    }
}
