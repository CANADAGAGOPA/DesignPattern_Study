package DP06_CommandPattern.GoodSimpleRemote;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
        System.out.println();
    }

    public void off() {
        System.out.println(location + " light is off");
        System.out.println();
    }
}
