package machinepocker.javabot.domain;

public class Bet {
    private int call ;
    private int raise ;
    private boolean canRaise;


    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getRaise() {
        return raise;
    }

    public void setRaise(int raise) {
        this.raise = raise;
    }

    public boolean isCanRaise() {
        return canRaise;
    }

    public void setCanRaise(boolean canRaise) {
        this.canRaise = canRaise;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "call=" + call +
                ", raise=" + raise +
                ", canRaise=" + canRaise +
                '}';
    }
}
