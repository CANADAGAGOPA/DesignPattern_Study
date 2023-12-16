package DP06_CommandPattern.BadSimpleRemote;

public class SimpleRemoteControl {
    Light l1;
    Light l2;

    TV tv;

    SimpleRemoteControl() {
        l1 = new Light("Kitchen");
        l2 = new Light("Living room");

        tv = new TV("Living room");
    }

    public void onButtonWasPushed(int n) {
        if (n == 0) {
            l1.on();
        } else if (n == 1) {
            l2.on();
        } else if (n == 2) {
            tv.on();
        }
    }

    public void offButtonWasPushed(int n) {
        if (n == 0) {
            l1.off();
        } else if (n == 1) {
            l2.off();
        } else if (n == 2) {
            tv.off();
        }
    }
}
