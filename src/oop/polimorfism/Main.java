package oop.polimorfism;

public class Main {
    public static void main(String[] args) {

        Phone deskPhone = new DeskPhone();
        deskPhone.setName("desktop phone");
        deskPhone.call();
        deskPhone.ring();

        Connection connection = new ConnectionImpl();

        Phone cellPhone = new CellPhone(connection);
        cellPhone.setName("cell");
        cellPhone.ring();
        cellPhone.call();

    }
}
