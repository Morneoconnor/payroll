package com.payroll.factory.demographic;

import com.payroll.domain.demographic.RaceDemo;
import com.payroll.util.Misc;

public class RaceDemoFactory {
    public static RaceDemo buildRace(String race){
        return new RaceDemo.Builder()
                .id(Misc.generateId())
                .description(race)
                .build();
    }
}
