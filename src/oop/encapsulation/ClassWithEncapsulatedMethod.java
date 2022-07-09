package oop.encapsulation;

public class ClassWithEncapsulatedMethod {
    private String name;

    // encapsulated method
    private String changeName(String name){
        return name + " changed";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = changeName(name);
    }
}
