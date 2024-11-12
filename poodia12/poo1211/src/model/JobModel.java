package model;

public class JobModel {
    private long id;
    private String title;
    private String description;
    private float price;
    private boolean availability;
    private String dateOfCreation;

    private Worker worker = new Worker();

    public JobModel(long id, String title, String description, float price, boolean availability, String dateOfCreation) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.availability = availability;
        this.dateOfCreation = dateOfCreation;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }
    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return id + " - Title: " + title + " - Description: " + description + " - Price: " + price;
    }

}


