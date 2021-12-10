package com.company;

import java.util.Scanner;

public class Deposit {
    String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public void know(int p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сделайте первый вклад ");
        int salym = sc.nextInt();
        while (!(salym >= 1000 && salym <= 300000)){
            System.out.println("Сумма не должна быть меньше 1000 или больше 300000");
            salym = sc.nextInt();
        }
        if (salym >= 1000 && salym <= 300000) {
            System.out.println("Досрочное снятие средств не предусмотрено.\nНа сколько месяцев вы открываете депозит\n 36 48 68 ");
            int month = sc.nextInt();
            while (!(month == 36 || month == 48 || month == 60)){
                System.out.println("Выберите из имеющихся чисел");
                month = sc.nextInt();
            }
            switch (month) {
                case 36:
                    System.out.println("Сколько вы собираетесь вкладываеть в месяц");
                    int monthS = sc.nextInt();
                    while (!(monthS >= 1000)){
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                        monthS = sc.nextInt();
                    }
                    if (monthS >= 1000) {
                        System.out.println("Деньги, которые вы получите через 3 года");
                        int res = (salym * p / 100) + salym + monthS * 36 * p / 100 + monthS * 36;
                        System.out.println(res);
                    } else {
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                    }
                    break;
                case 48:
                    System.out.println("Сколько вы собираетесь вкладываеть в месяц");
                    int monthS1 = sc.nextInt();
                    while (!(monthS1 >= 1000)){
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                        monthS1 = sc.nextInt();
                    }
                    if (monthS1 >= 1000) {
                        System.out.println("Деньги, которые вы получите через 4 года");
                        int res = (salym * p / 100) + salym + monthS1 * 48 * p / 100 + monthS1 * 48;
                        System.out.println(res);
                    } else {
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                    }
                    break;
                case 60:
                    System.out.println("Сколько вы собираетесь вкладываеть в месяц");
                    int monthS2 = sc.nextInt();
                    while (!(monthS2 >= 1000)){
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                        monthS2 = sc.nextInt();
                    }
                    if (monthS2 >= 1000) {
                        System.out.println("Деньги, которые вы получите через 5 лет");
                        int res = (salym * p / 100) + salym + monthS2 * 60 * p/ 100 + monthS2 * 60;
                        System.out.println(res);
                    } else {
                        System.out.println("Минимальный ежемесячный депозит: 1000тг");
                    }
                    break;
                default:
                    System.out.println("Выберите из имеющихся чисел");
                    break;
            }
        }
    }
}
