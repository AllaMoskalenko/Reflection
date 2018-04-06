package ua.alla.newWorld.Persons;

import java.lang.reflect.Constructor;


public class Ref {
    public static void main(String[] args) throws Exception {

        Class class1 = Class.forName("ua.alla.newWorld.Persons.Student");
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getModifiers());

        Constructor[] constr =class1.getDeclaredConstructors();
        for (Constructor constructor : constr){
            System.out.println(constructor);


        }

        }

    }


