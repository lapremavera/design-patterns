package com.realdolmen.ood020.adapter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeAdapter implements HasAge {

    private HasBirthDate hasBirthDate;

    public AgeAdapter(HasBirthDate hasBirthDate){
        this.hasBirthDate = hasBirthDate;
    }

    @Override
    public long getAge() {
        return ChronoUnit.YEARS.between(hasBirthDate.getBirthdate(), LocalDate.now());
    }
}
