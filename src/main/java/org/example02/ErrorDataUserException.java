package org.example02;

import java.util.List;

public class ErrorDataUserException extends RuntimeException{
    public ErrorDataUserException(List<String>error) {
        super(String.format("Ошибки ввода:  %s",error));
    }
}
