package machinepocker.javabot.domain;

import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private String name;
    private int blind ;
    private int ante;
    private int wagered;
    private String activate;
    private int chips;
    private Map<String,List<Action>> actions = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlind() {
        return blind;
    }

    public void setBlind(int blind) {
        this.blind = blind;
    }

    public int getAnte() {
        return ante;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    public int getWagered() {
        return wagered;
    }

    public void setWagered(int wagered) {
        this.wagered = wagered;
    }

    public String getActivate() {
        return activate;
    }

    public void setActivate(String activate) {
        this.activate = activate;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public Map<String, List<Action>> getActions() {
        return actions;
    }

    public void setActions(Map<String, List<Action>> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", blind=" + blind +
                ", ante=" + ante +
                ", wagered=" + wagered +
                ", activate='" + activate + '\'' +
                ", chips=" + chips +
                ", actions=" + actions +
                '}';
    }
}
