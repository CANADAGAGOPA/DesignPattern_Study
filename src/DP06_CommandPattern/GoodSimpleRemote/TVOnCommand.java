package DP06_CommandPattern.GoodSimpleRemote;

public class TVOnCommand implements Command {
    TV tv;

    TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }
}
