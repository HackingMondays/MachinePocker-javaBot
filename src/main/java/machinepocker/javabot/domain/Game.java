package machinepocker.javabot.domain;

import com.google.common.collect.Lists;

import java.util.List;

/**
 { "community": [ "2c", "Qh", "Jc" ],
 "state": "flop",
 "hand": 1,
 "betting": { "call": 0, "raise": 10, "canRaise": true },
 "self":
 { "name": "Me",
 "blind": 5,
 "ante": 0,
 "wagered": 10,
 "state": "active",
 "chips": 990,
 "actions": { "pre-flop": [ { "type": "call", "bet": 5 } ] },
 "cards": [ "Qd", "8h" ],
 "position": 0,
 "brain": {} },
 "players":
 [ { "name": "Me",
 "blind": 5,
 "ante": 0,
 "wagered": 10,
 "state": "active",
 "chips": 990,
 "actions": { "pre-flop": [ { "type": "call", "bet": 5 } ] } },
 { "name": "CallBot #1",
 "blind": 10,
 "ante": 0,
 "wagered": 10,
 "state": "active",
 "chips": 990,
 "actions": { "pre-flop": [ { "type": "check" } ] } },
 { "name": "CallBot #2",
 "blind": 0,
 "ante": 0,
 "wagered": 10,
 "state": "active",
 "chips": 990,
 "actions": { "pre-flop": [ { "type": "call", "bet": 10 } ] } },
 { "name": "FoldBot #1",
 "blind": 0,
 "ante": 0,
 "wagered": 0,
 "state": "folded",
 "chips": 1000,
 "actions": { "pre-flop": [ { "type": "fold" } ] } } ] }


 Your play function should simply return a integer of the amount you wish to bet. This bet is in ADDITION to the amount you've already wagered.

 For example, lets say you've wagered $10 so far, and are presented with the following betting state.

 { community: [ 'Kh', '7c', '2c' ],
 "state": 'flop',
 hand: 1,
 betting: { call: 10, raise: 20, canRaise: true },
 self:
 { "name": 'Me',
 "blind": 5,
 "ante": 0,
 "wagered": 10,
 "state": 'active',
 "chips": 990,
 "actions": { 'pre-flop': [ { "type": 'call', "bet": 5 } ] },
 "cards": [ '6s', 'Qh' ],
 "position": 0,
 // Concatenated for brevity



 A bet of 0 will result in a fold, because you need to bet 10 in order to stay in the game.
 A bet of 10 will result in a call.
 You can also bet 20 or more in order to raise. If you've already raised and there have been no subsequent raises, you won't be able to raise again and the canRaise flag will be set to false

 */
public class Game {
    private List<String> community = Lists.newArrayList();
    private String state;
    private int hand;
    private Bet betting ;
    private SelfPlayer self;
    private List<Player> players = Lists.newArrayList();

    public List<String> getCommunity() {
        return community;
    }

    public void setCommunity(List<String> community) {
        this.community = community;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public Bet getBetting() {
        return betting;
    }

    public void setBetting(Bet betting) {
        this.betting = betting;
    }

    public SelfPlayer getSelf() {
        return self;
    }

    public void setSelf(SelfPlayer self) {
        this.self = self;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "community=" + community +
                ", state='" + state + '\'' +
                ", hand=" + hand +
                ", betting=" + betting +
                ", self=" + self +
                ", players=" + players +
                '}';
    }
}
