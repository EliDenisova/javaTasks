package Telephone;

public class Mobile extends Telephone implements  TypeOfConnection, SendMessage, TakeMessage, ConnectionOfTheBaseWithTheHandset{
    private Object communicationModule;
    public Mobile(Object speaker, Object microphone, Object communicationModule) {
        super(speaker, microphone);
        this.communicationModule = communicationModule;
    }

    @Override
    public void receiveMessage() {
        System.out.println("отправляю сообщение");
    }

    @Override
    public void acceptMessage() {
        System.out.println("принимаю сообщение");
    }

    @Override
    public void connection() {
        System.out.println("сотовая связь");
    }

    @Override
    public void connectionOfTheBaseWithTheHandset() {
        System.out.println("нет базы");
    }
}
