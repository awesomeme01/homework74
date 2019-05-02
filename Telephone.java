package com.company.demoHomework;

public class Telephone {
    private String model;
    private String brand;
    private String country;
    private String date;
    private double price;
    private boolean available;

    private Telephone(){}

    public static class Builder{
        private String model;
        private String brand;
        private String country;
        private String date;
        private double price;
        private boolean available;
        public Builder(String model){
            this.model = model;
        }
        public Builder withBrand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder withCountry(String country){
            this.country = country;
            return this;
        }
        public Builder withDate(String date){
            this.date = date;
            return this;
        }
        public Builder withPrice(double price){
            this.price = price;
            return this;
        }
        public Builder withAvailable(boolean available){
            this.available = available;
            return this;
        }
        public Telephone build(){
            Telephone telephone = new Telephone();
            telephone.model = this.model;
            telephone.brand = this.brand;
            telephone.country = this.country;
            telephone.date = this.date;
            telephone.price = this.price;
            telephone.available = this.available;
            return telephone;
        }
        public static void main(String[] args) {
            Telephone telephone = new Telephone.Builder("iPhone X").withBrand("Apple").withCountry("USA").withDate("2018").withPrice(900).withAvailable(true).build();
            System.out.println(telephone);
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
