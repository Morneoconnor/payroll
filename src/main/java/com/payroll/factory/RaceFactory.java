package com.payroll.factory;

import com.payroll.domain.User.Race;

public class RaceFactory {
    public static Race buildRace(String race, String id) {
        return new Race.Builder().race(race)
                .id(id)
                .build();
    }
}
