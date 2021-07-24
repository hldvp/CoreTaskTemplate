package com.company;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	    Animal dog = new Animal("Dog");
	    Animal cat = new Animal("Cat");
	    Animal rabit = new Animal("Rabit");

	    Animal [] animals = new Animal[] {
	        dog, cat, rabit
        };
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeInt(animals.length);
        for (Animal animal : animals) {
            objectOutputStream.writeObject(animal);
        }

        objectOutputStream.close();
        System.out.println("ok");


        Animal[] animals1 = deserializeAnimalArray(outputStream.toByteArray());
        System.out.println();
        for (Animal animal : animals1) {
            System.out.println(animal.toString());
        }

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (InputStream inputStream = new ByteArrayInputStream(data)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Animal[] animals = new Animal[objectInputStream.readInt()];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
            return animals;
        } catch (RuntimeException | IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }
}
