package edu.hanover.bcherbalremides;

public class Drink {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Sencha", "A popular green tea from Japan", R.drawable.sencha),
            new Drink("Wakocha", "A popular black tea from Japan", R.drawable.sencha),
            new Drink("Matcha", "Highest quality beans roasted and brewed fresh", R.drawable.sencha)
    };

    //Each Drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}