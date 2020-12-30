package by.belhard.j26.lessons.lesson14.reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {

        MyExample ex = new MyExample(1);
        ex.displayParam("q");
        Class<? extends MyExample> aClass = ex.getClass();
        Class<MyExample> mec = MyExample.class;

        System.out.println(mec.getName());
        System.out.println(mec.getSimpleName());

//        Constructor<MyExample> constructor1 = mec.getConstructor();
//        System.out.println(constructor1);

        Constructor<MyExample> constructor2 = mec.getConstructor(Integer.class);
        System.out.println(constructor2);

        Field[] fields = mec.getDeclaredFields();
        System.out.println(fields[0]);

        Method[] methods = mec.getMethods();
        Method method = methods[0];
        System.out.println(method);

        method.invoke(ex, "methodInvoke");
        method.invoke(new MyExample(500), "newMyExample");

        Field a = mec.getDeclaredField("a");
        a.setAccessible(true);
        System.out.println(a.get(ex));
        a.set(ex, 123);
        System.out.println(a.get(ex));


    }
}
