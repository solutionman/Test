package oop.polimorfism;

public class CellPhone extends Phone {
    private final Connection connection;

    public void connectToInet() {
        connection.connectingToInternet();
    }

    CellPhone(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void ring() {
        System.out.println("Melody ringing");
    }
}
