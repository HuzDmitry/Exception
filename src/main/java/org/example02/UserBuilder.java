package org.example02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserBuilder {
    private Scanner scanner = new Scanner(System.in);
    private String [] dataUser;

    public String[] getDataUser() {
        String[] strings = (dataUser != null) ? dataUser : new String[0];
        return strings;
    }
    public boolean createUser(){
        setDataUser();
        try {
            analisDataUser();
            return true;
        }catch (ErrorDataUserException e){
            System.err.println(e.getMessage());
            return false;
        }
    }
    private String[] setDataUser(){
        System.out.println("Ведите данные: <Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>");
        String data=scanner.nextLine();
        return dataUser=data.split(" ");
    }
    private void analisDataUser() throws ErrorDataUserException{
        List<String> error = new ArrayList<>();
        if (dataUser.length != 6){
            error.add("Необходимо только 6 форм данных ");
            throw new ErrorDataUserException(error);}
        if (!dataUser[0].matches("[a-zA-Z]+"))
            error.add("Фамилия не корректна");
        if (!dataUser[1].matches("[a-zA-Z]+"))
            error.add("Имя не корректно");
        if (!dataUser[2].matches("[a-zA-Z]+"))
            error.add("Отчество не корректно.");
        if (!dataUser[3].matches("(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012]).((19|20)\\d\\d)"))
            error.add("Дата рождения не в формате dd.mm.yyyy");
        if (!dataUser[4].matches("[0-9]{7}"))
            error.add("номер телефона не содержит 7 цифр");
        if (!dataUser[5].matches("F|M"))
            error.add("укажите пол только F или M");
        if (!error.isEmpty())
            throw new ErrorDataUserException(error);
    }
}
