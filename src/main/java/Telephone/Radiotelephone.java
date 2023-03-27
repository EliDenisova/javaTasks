package Telephone;

public class Radiotelephone extends Telephone implements  TypeOfConnection, SendMessage, TakeMessage, ConnectionOfTheBaseWithTheHandset{
   private Object radioModule;
    public Radiotelephone(Object speaker, Object microphone, Object radioModule) {
        super(speaker, microphone);
        this.radioModule = radioModule;
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
        System.out.println("по кабелю");
    }

    @Override
    public void connectionOfTheBaseWithTheHandset() {
        System.out.println("радио");
    }
}
