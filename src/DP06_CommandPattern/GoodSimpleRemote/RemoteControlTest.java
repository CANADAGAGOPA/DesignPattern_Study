package DP06_CommandPattern.GoodSimpleRemote;
public class RemoteControlTest {
    public static void main(String[] args) {
     // SimpleRemoteControl remote = new SimpleRemoteControl();
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        TV tv = new TV("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, tvOn, tvOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);

        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);

        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
    }
}
