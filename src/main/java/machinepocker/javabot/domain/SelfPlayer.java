package machinepocker.javabot.domain;

import com.google.common.collect.Lists;

import java.util.List;

public class SelfPlayer extends Player{

    private List<String> cards = Lists.newArrayList();
    private Integer position ;
    private Object brain;

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Object getBrain() {
        return brain;
    }

    public void setBrain(Object brain) {
        this.brain = brain;
    }

    @Override
    public String toString() {
        return "SelfPlayer{" +
                "name='" + getName() + '\'' +
                ", blind=" + getBlind() +
                ", ante=" + getAnte() +
                ", wagered=" + getWagered() +
                ", activate='" + getActivate() + '\'' +
                ", chips=" + getChips() +
                ", actions=" + getActions() +
                ", cards=" + cards +
                ", position=" + position +
                ", brain=" + brain +
                '}';
    }
}
