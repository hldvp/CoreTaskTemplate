package com.company;

public class StolenPackageException extends RuntimeException {

    public StolenPackageException() {
        super("Обнаружена посылка, состоящая из камней.");
    }

}
