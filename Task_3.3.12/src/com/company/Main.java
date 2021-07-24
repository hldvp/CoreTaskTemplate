package com.company;

public class Main {

    public static void main(String[] args) {
        Human humanOne = new Human();
        Human humanTwo = new Human((byte) 34, "Ilya", "Kholodov", "fencing");
        Human humanThree = new Human((byte) 34, "Ilya", "Kholodov");
    }
}
