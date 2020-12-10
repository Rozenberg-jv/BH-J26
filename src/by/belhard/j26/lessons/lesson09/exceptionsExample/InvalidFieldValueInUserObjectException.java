package by.belhard.j26.lessons.lesson09.exceptionsExample;

public class InvalidFieldValueInUserObjectException extends RuntimeException {

    public InvalidFieldValueInUserObjectException(String message) {
        super(message);
    }
}
