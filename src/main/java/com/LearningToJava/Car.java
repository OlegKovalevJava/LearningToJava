package com.LearningToJava;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private double price;

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.make = this.make;
            car.model = this.model;
            car.year = this.year;
            car.price = this.price;
            return car;
        }
    }

    private Car() {
    } // Prevent direct instantiation

    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        Car car = new Builder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2020)
                .setPrice(25000.0)
                .build();
        System.out.println(car); // Output: Car [make=Toyota, model=Camry, year=2020, price=25000.0]
    }
}
