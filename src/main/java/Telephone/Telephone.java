package Telephone;

public abstract class Telephone implements TakeCall, MakeCall {

    private Object speaker;
    private Object microphone;

    public Telephone(Object speaker, Object microphone) {
        this.speaker = speaker;
        this.microphone = microphone;
    }

    public Object getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Object speaker) {
        this.speaker = speaker;
    }

    public Object getMicrophone() {
        return microphone;
    }

    public void setMicrophone(Object microphone) {
        this.microphone = microphone;
    }

    @Override
    public void call() {
        System.out.println("делаю звонок");
    }
    @Override
    public void accept() {
        System.out.println("принимаю звонок");
    }
}
