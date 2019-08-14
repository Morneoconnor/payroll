package com.payroll.domain.demographic;

public class GenderDemo {
    private String id, description;

    private GenderDemo(){}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GenderDemo(Builder builder){
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
        return "Gender{" +
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

        public GenderDemo build(){
            return new GenderDemo(this);
        }

        public Builder copy(GenderDemo gender){
            this.id = id;
            this.description = description;

            return this;
        }
    }
}

