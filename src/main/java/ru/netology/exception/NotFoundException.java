package ru.netology.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String err) {
        super(err);
    }


}
