package edu.northeastern.cs5500.delivery.model;

import java.util.Objects;

public class Address {

    private String streetAndNumber;
    private String city;
    private String state;
    private String zip;

    public Address(String streetAndNumber, String city, String state, String zip) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetAndNumber, address.streetAndNumber) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetAndNumber, city, state, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAndNumber='" + streetAndNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
