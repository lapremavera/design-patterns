package com.realdolmen.ood020.adapter;

import java.time.LocalDate;

public class Person implements HasBirthDate {

    private LocalDate birthdate;

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
