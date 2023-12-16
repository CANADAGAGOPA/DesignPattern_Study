package DP06_CommandPattern.BadSimpleRemote;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);

        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
    }
}
