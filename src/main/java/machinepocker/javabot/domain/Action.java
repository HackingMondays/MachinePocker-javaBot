package machinepocker.javabot.domain;

/**

 actions: {
 'pre-flop': [ { type: 'call', bet: 5 } ]
 }
 */
public class Action {
    private String type ;
    private int bet;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    @Override
    public String toString() {
        return "Action{" +
                "type='" + type + '\'' +
                ", bet=" + bet +
                '}';
    }
}
