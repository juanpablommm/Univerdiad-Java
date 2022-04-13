package com.universidadjava.exceptions;

@SuppressWarnings("serial")
public class GenericExeption extends Exception{

    public GenericExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericExeption(String message) {
        super(message);
    }
}
