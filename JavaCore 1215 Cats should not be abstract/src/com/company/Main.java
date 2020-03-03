package com.company;

/*

1215 Cats should not be abstract!
Inherit the Cat and Dog classes from Pet.
Implement the missing methods.
The Cat and Dog classes should not be abstract.

Requirements:
1. The class Pet must be abstract.
2. The Dog class should not be abstract.
3. The Cat class should not be abstract.
4. The Dog class must implement abstract methods from the Pet class.
5. The Cat class must implement abstract methods from the Pet class.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Кошка";
        }

        @Override
        public Cat getChild() {
            return new Cat();
        }
    }
    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "Собака";
        }

        @Override
        public Dog getChild() {
            return new Dog();
        }
    }
}
