package Telephone;

public class Stationary extends Telephone implements TypeOfConnection, ConnectionOfTheBaseWithTheHandset{
    private Object phoneDisk;
    public Stationary(Object speaker, Object microphone, Object phoneDisk) {
        super(speaker, microphone);
        this.phoneDisk = phoneDisk;
    }

    @Override
    public void connection() {
        System.out.println("Соединяю по кабелю");
    }

    @Override
    public void connectionOfTheBaseWithTheHandset() {
        System.out.println("по кабелю");
    }
}
