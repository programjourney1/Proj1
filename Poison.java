package org.example;

public class Poison {
    public String Species;
    public String Description;
    public String player;
    public Poison(){}

    public Poison(String Species, String Description, String player) {
        this.Species = Species;
        this.Description = Description;
        this.player = player;
    }
    /////////////
    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public void setSpecies(String Species){this.Species=Species;}



    public String getPoisonS() {

        return Species;
    }
    public String getPoisonD() {

        return Description;
    }
    public String getplayerp() {

        return player;
    }

}


