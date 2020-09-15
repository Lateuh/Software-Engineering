package exemple;

public class CommandDemo {
    public static void main(final String[] arguments) {
        Light lamp = new Light();

        Command switchOn = lamp::turnOn;
        Command switchOff = lamp::turnOff;

        Switch mySwitch = new Switch();
        mySwitch.register("on", switchOn);
        mySwitch.register("off", switchOff);

        mySwitch.execute("on");
        mySwitch.execute("off");
    }
}