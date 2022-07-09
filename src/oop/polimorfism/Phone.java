package oop.polimorfism;

public abstract class Phone {
    private String name;
    private String ring = "Phone ringing";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("Phone " + name + " calling");
    }

    public void ring() {
        System.out.println(ring);
    }

    public void setRing(String ring){
        this.ring = ring;
    }
}
