package by.belhard.j26.lessons.lesson14.annotationsExample;

import java.lang.reflect.Field;

public class ObjectPrinter {


    public void print(Object o) throws IllegalAccessException {

        Class<?> aClass = o.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();

        StringBuilder result = new StringBuilder();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            Repeater annotation = field.getAnnotation(Repeater.class);

            if (annotation == null)
                continue;

            int times = annotation.times();

            for (int i = 0; i < times; i++)
                result.append(field.get(o));

            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
