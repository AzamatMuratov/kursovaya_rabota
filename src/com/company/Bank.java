package com.company;

public class Bank {
    private String bankName;
    private int percent;
    private String osobennost;

    public Bank(String bankName, int percent, String osobennost) {
        this.bankName = bankName;
        this.percent = percent;
        this.osobennost = osobennost;
    }

    public String getBanknName() {
        return bankName;
    }

    public void setBanknaName(String banknaNme) {
        this.bankName = bankName;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getOsobennost() {
        return osobennost;
    }

    public void setOsobennost(String osobennost) {
        this.osobennost = osobennost;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Имя банка - '" + bankName + '\'' +
                ", проценты банка - " + percent +
                ", возможность - '" + osobennost + '\'' +
                '}';
    }
}
