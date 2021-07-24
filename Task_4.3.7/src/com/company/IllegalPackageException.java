package com.company;

public class IllegalPackageException extends RuntimeException {

    public IllegalPackageException() {
        super("Обнаружена посылка с запрещенным содержимым.");
    }

}
