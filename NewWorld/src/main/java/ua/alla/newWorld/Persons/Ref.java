package ua.alla.newWorld.Persons;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;


public class Ref {
    public static void main(String[] args)  throws Exception {

        Student student = new Student("Ivanoff", 18);

        baseInfo(student);
        interfaceInfo(student);
        annotationInfo(student);
        fieldsInfo(student);
        methodsInfo(student);
        constructorInfo(student);

    }



        public static void baseInfo (Object object){

            Class class1 = object.getClass();

            System.out.println("Class name: " + class1.getName());

            System.out.println("Simple name: " + class1.getSimpleName());

            System.out.println("SuperClass: " + class1.getSuperclass());

            System.out.println("Modifier: " + Modifier.toString(class1.getModifiers()));
        }

        public static void interfaceInfo (Object object) {

            Class class1 = object.getClass();

            System.out.print("Interfaces: ");
            Class[] interfaces = class1.getInterfaces();
            for (Class i : interfaces) {
                System.out.println(i.getName());
            }
        }

        public static void annotationInfo(Object object) {

            Class class1 = object.getClass();
            System.out.println("");
            System.out.println("Annotations: ");
            Method[] meth = class1.getMethods();
            for (Method metod : meth) {
                Annotation[] annotations = metod.getAnnotations();
                for (Annotation a : annotations) {
                    System.out.println("Method " + metod.getName() + " : " + a.toString());
                }
            }

            Field[] fiel = class1.getDeclaredFields();
            for (Field f : fiel) {
                Annotation[] annotations = f.getAnnotations();
                for (Annotation a : annotations) {
                    System.out.println("Field " + f.getName() + " : " + a.toString());
                }
            }

        }

        public static void fieldsInfo (Object object) {

            Class class1 = object.getClass();
            System.out.println("");
            System.out.println("Fields: ");
            Field[] fields = class1.getDeclaredFields();
            for (Field f : fields) {
                System.out.print(Modifier.toString(f.getModifiers()) + " ");
                System.out.print(f.getType().getName() + " ");
                System.out.println(f.getName());
            }
        }

        public static void methodsInfo(Object object) {

            Class class1 = object.getClass();

            System.out.println("");
            System.out.println("Methods:");
            Method[] methods = class1.getMethods();
            for (Method met : methods) {
                System.out.print(Modifier.toString(met.getModifiers()) + " ");
                System.out.print(met.getReturnType().getName() + " ");
                System.out.println(met.getName());
            }
        }


        public static void constructorInfo (Object object){

            Class class1 = object.getClass();
            System.out.println("");
            System.out.println("Constructors: ");
            Constructor[] constr = class1.getDeclaredConstructors();
            for (Constructor constructor : constr) {
                System.out.println(constructor);
            }
        }

}




