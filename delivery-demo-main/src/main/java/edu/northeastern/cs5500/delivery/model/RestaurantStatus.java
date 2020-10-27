package edu.northeastern.cs5500.delivery.model;

import java.util.Objects;

public class RestaurantStatus {

    private boolean open;
    private String name;
    private String description;
    private String imageURL;
    private String category;
    private String otherNote;

    public RestaurantStatus(boolean open, String name, String description, String imageURL, String category, String otherNote) {
        this.open = open;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.category = category;
        this.otherNote = otherNote;
    }

    public RestaurantStatus(boolean open, String name, String description, String imageURL, String category) {
        this.open = open;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.category = category;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptions(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantStatus that = (RestaurantStatus) o;
        return open == that.open && Objects.equals(name, that.name) && Objects.equals(description, that.description)
                && Objects.equals(imageURL, that.imageURL) && Objects.equals(category, that.category)
                && Objects.equals(otherNote, that.otherNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(open, name, description, imageURL, category, otherNote);
    }

    @Override
    public String toString() {
        return "RestaurantStatus{" +
                "open=" + open +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", category='" + category + '\'' +
                ", otherNote='" + otherNote + '\'' +
                '}';
    }
}
