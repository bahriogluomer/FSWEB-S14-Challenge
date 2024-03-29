package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String name, double price, String breadRollType) {
        super(name,"Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        if (this.healthyExtra1Name != null) {
            setPrice(getPrice() + this.healthyExtra1Price);
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            setPrice(getPrice() + this.healthyExtra2Price)  ;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        System.out.println(super.itemizeHamburger() +  "\nHealthy Addition 1: " + this.healthyExtra1Name + "\nHealthy Addition 2: " + this.healthyExtra2Name);
        return getPrice();
    }

}
