package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(System.in);
        actions deistviya = new actions();
        System.out.println("Введите ваши логин и пароль: ");
        deistviya.LoginParol(sc.nextLine(), sc.nextLine());
    }
}
