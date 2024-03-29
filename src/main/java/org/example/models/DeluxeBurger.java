package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
    public DeluxeBurger() {
        super("Deluxe", "Beef", 19.10, "SANDWICH");
        this.cips = "CURVY";
        this.drink = "COKE";
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println(super.itemizeHamburger() + "\nCips: " + this.cips + "\nDrink: " + this.drink);
        return getPrice();
    }



}
