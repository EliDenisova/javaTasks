package Telephone;

public class SatellitePhone extends Telephone implements  TypeOfConnection, SendMessage, TakeMessage, ConnectionOfTheBaseWithTheHandset {

    private Object antenna;
    public SatellitePhone(Object speaker, Object microphone, Object antenna) {
        super(speaker, microphone);
        this.antenna = antenna;
    }

    @Override
    public void receiveMessage() {
        System.out.println("принимаю сообщение");
    }

    @Override
    public void acceptMessage() {
        System.out.println("отправляю сообщение");
    }

    @Override
    public void connection() {
        System.out.println("спутниковая связь");
    }

    @Override
    public void connectionOfTheBaseWithTheHandset() {
        System.out.println("нет базы");
    }
}
