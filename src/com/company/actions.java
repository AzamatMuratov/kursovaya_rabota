package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class actions implements Login {
    public void LoginParol(String login, String parol){
        int i=0;
        while(true){
            if ((login.equals("Azamat") && parol.equals("qwerty"))  )
            {
                System.out.println("");
                banki();
            }
            else {
                System.out.println("Error") ; break;
            }
        }
    }
    public static void banki() {
        Deposit deposit = new Deposit();
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> list = new ArrayList<Bank>() {{
            add(new Bank("HalyqBank", 12, "У нас нет досрочных выводов и пополнений"));
            add(new Bank("KaspiBank", 1, "У нас досрочные изъятия и пополнения"));
            add(new Bank("BankCenterCredit", 9, "У нас есть только ранние пополнения"));
        }};
        KaspiBank kaspiBank = new KaspiBank();
        HalyqBank halyqBank = new HalyqBank();
        BCC bcc = new BCC();
        System.out.print("Здравствуйте, Я Арман. Ваш гид\nПожалуйста, укажите ваше имя:");
        String name = sc.nextLine();
        while(name.isEmpty()){
            System.out.println("Нужно обязательно указать имя: ");
            name = sc.nextLine();
        }
            System.out.print(name + ", Пожалуйста, укажите ваш возраст - ");
            while (true) {
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18 || age > 63) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Ваш возраст не подходит для открытия депозита");
                    }
                }
                if (age >= 18 && age <= 63) {
                    while (true) {
                        System.out.println("Выберите подходящий для вас банк:");
                        for (Bank bank : list) {
                            System.out.println(bank);
                        }
                        System.out.println("1------2-------3-----9>>>Выход");
                        int san = sc.nextInt();
                        switch (san) {
                            case 1:
                                deposit.setNameBank("Халык банк");
                                System.out.println("Вы выбрали " + deposit.getNameBank());
                                halyqBank.know(8);
                                break;
                            case 2:
                                deposit.setNameBank("Kaspi Bank");
                                System.out.println("Вы выбрали " + deposit.getNameBank());
                                kaspiBank.know(12);

                                break;
                            case 3:
                                deposit.setNameBank("Центр Кредит Банк");
                                System.out.println("Вы выбрали " + deposit.getNameBank());
                               bcc.know(10);
                                break;
                            case 9:
                                System.out.println("До Свидания");
                                System.exit(0);
                            default:
                                System.out.println("Пожалуйста, выберите другое число");
                                break;
                        }
                    }
                }
            }
    }
}


