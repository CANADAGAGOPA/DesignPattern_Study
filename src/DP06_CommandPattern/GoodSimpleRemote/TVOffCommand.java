package DP06_CommandPattern.GoodSimpleRemote;

public class TVOffCommand implements Command {
    TV tv;

    TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }
}
