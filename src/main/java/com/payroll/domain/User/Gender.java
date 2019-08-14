package com.payroll.domain.User;

import java.util.Objects;
import java.util.Set;

public class Gender {
    private String gender, id;

    private Gender()
    {

    }
    private Gender(Builder builder)
    {
        this.gender = builder.gender;
        this.id = builder.id;

    }
    public String getGender() {
        return gender;
    }
    public String getId() {
        return id;
    }

    public static class Builder {

        private String gender, id;
        private Set<Gender> genderSet;

        public Builder gender( String gender) {
            this.gender = gender;
            return this;
        }

        public Builder id( String id) {
            this.id = id;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }

    }

    @Override
    public String toString() {
        return "Gender{" +
                "Gender='" + gender + '\'' +
                "Id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return gender.equals(gender.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender);
    }
}

