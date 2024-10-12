package main.java.ezhidkova.week10;

import java.util.HashMap;

public class Account {
    String login;
    String password;

    HashMap<String, String> accounts = new HashMap<>();

    {
        accounts.put("TestTest", "1234567890");
        accounts.put("HelloWorld", "qwerty123");
    }

    void checkLogin(String login) throws WrongLoginException {
            if (login == null || login.length() < 5 || login.length() > 20) {
                throw new WrongLoginException();
            } else {
                this.login = login;
                System.out.println("Логин введён корректно");
            }
    }

    void checkPassword(String password, String passwordRepeat) throws WrongPasswordException {
        if ((password == null) || (password.length() < 8) || (password.length() > 20) || (password != passwordRepeat)) {
            throw new WrongPasswordException();
        } else {
            this.password= password;
            System.out.println("Пароль введён корректно");
        }
    }

    void checkLoginAndPassword (String login, String password) throws WrongLoginOrPasswordException {
        if (!(accounts.containsKey(login) && accounts.get(login).equals(password))) {
            throw new WrongLoginOrPasswordException();
        } else {
            System.out.println("\"Вы успешно вошли в аккаунт!\"");
        }
    }

    public static void main (String[] args) {
        Account login = new Account();
        /**try {
            login.checkLogin("1234");
        }
        catch (WrongLoginException e){
            System.out.println("Некорректный логин");
            System.out.println(e);
        }**/
        /**try {
            login.checkPassword("1234567", "1234567");
        }
        catch (WrongPasswordException e) {
            System.out.println("Некорректный пароль");
            System.out.println(e);
        }**/
        try {
            login.checkLoginAndPassword("HelloWorld", "qwerty123");
        }
        catch (WrongLoginOrPasswordException e){
            System.out.println("Вы некорректно ввели логин или пароль");
        }
    }
}


