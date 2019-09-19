package classLoader;

import org.junit.Test;

/*
* 根加载器
* 负责虚拟机核心类库的加载
* */
public class BootStrapClassLoader {

    @Test
    public void  tet1(){
        System.out.println("BootStrap:"+String.class.getClassLoader());
        //String.class的类加载器是根加载器,根加载器是获取不到引用的,此处输出为null
        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
