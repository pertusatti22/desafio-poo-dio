package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    @Override
    public double xpCalculate(){
        return STANDARD_XP + 20d;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
