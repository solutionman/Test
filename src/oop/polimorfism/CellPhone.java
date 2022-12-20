package oop.polimorfism;

public class CellPhone extends Phone {
    private final Connection connection;

    private void connectToInet() {
        connection.connectingToInternet();
    }

    CellPhone(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void ring() {
        connectToInet();
        System.out.println("Check incoming phone in blacklist");
        System.out.println("Melody ringing");
    }
}
