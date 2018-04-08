package ua.alla.newWorld.Persons;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;


public class Ref {
    public static void main(String[] args)  throws Exception {
        //args[0] = "ua.alla.newWorld.Persons.Student";

        Class class1 = Class.forName("ua.alla.newWorld.Persons.Student");

        System.out.println("Class name: " + class1.getName());

        System.out.println("Simple name: " + class1.getSimpleName());

        System.out.println("SuperClass: " + class1.getSuperclass());

        System.out.println("Modifier: " + Modifier.toString(class1.getModifiers()));

        System.out.print("Interface: ");
        Class[] interfaces = class1.getInterfaces();
        for (Class i : interfaces){
            System.out.println(i.getName());
        }

        System.out.println("");
        System.out.println("Annotations: ");
        Method[] meth = class1.getMethods();
        for (Method metod : meth) {
            Annotation[] annotations = metod.getAnnotations();
            for (Annotation a: annotations){
                System.out.println("Method " + metod.getName() + " : " + a.toString());
            }
        }
        Field[] fiel = class1.getDeclaredFields();
        for (Field f : fiel){
            Annotation[] annotations = f.getAnnotations();
            for (Annotation a: annotations){
                System.out.println("Field " + f.getName() + " : " + a.toString());
            }
        }

        System.out.println("");
        System.out.println("Fields: ");
        Field[] fields = class1.getDeclaredFields();
        for (Field f : fields){
            System.out.print(Modifier.toString(f.getModifiers())+" ");
            System.out.print(f.getType().getName()+ " ");
            System.out.println(f.getName());
        }

            System.out.println("");
            System.out.println("Methods:");
            Method[] methods = class1.getMethods();
            for (Method met : methods) {
                System.out.print(Modifier.toString(met.getModifiers()) + " ");
                System.out.print(met.getReturnType().getName()+ " ");
                System.out.println(met.getName());
            }

            System.out.println("");
            System.out.println("Constructor: ");
            Constructor[] constr = class1.getDeclaredConstructors();
            for (Constructor constructor : constr) {
                System.out.println(constructor);
            }

        }
}




