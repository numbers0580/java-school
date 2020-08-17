package com.lambdaschool.schools.exceptions;

public class TurtleException extends RuntimeException {
    public TurtleException(String message) {
        super("Turtles make no sense: " + message);
    }
}
