package com.payroll.domain.demographic;

public class RaceDemo {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    private RaceDemo(){}

    public RaceDemo(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String id, description;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public RaceDemo build(){
            return new RaceDemo(this);
        }

        public Builder copy(RaceDemo race){
            this.id = id;
            this.description = description;

            return this;
        }
    }

}

