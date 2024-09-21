package model.exception;

public class FileNotFoundException extends java.io.FileNotFoundException {
    public FileNotFoundException(String s) {
        super(s);
    }

    public FileNotFoundException() {
    }
}
