package com.payroll.domain.User;

import java.util.Objects;
import java.util.Set;

public class Race {
    private String race, id;

    private Race()
    {

    }
    private Race(Builder builder)
    {
        this.race = builder.race;
        this.id = builder.id;
    }

    public String getRace() {
        return race;
    }

    public String getId() {
        return id;
    }
    public static class Builder {

        private String race, id ;
        private Set<Race> _raceSet;



        public Builder race( String race) {
            this.race = race;
            return this;
        }
        public Builder id( String id) {
            this.id = id;
            return this;
        }
        public Race build() {
            return new Race(this);
        }

    }

    @Override
    public String toString() {
        return "Race{" +
                "Race='" + race + '\'' +
                "Id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return race.equals(race.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(race);
    }
}
