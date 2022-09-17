package org.example;

public class Flying {
    public String Species;
    public String Description;
    public String player;
    public Flying(){}


    public Flying(String Species, String Description, String player) {
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
    public String getFlyingS() {

        return Species;
    }
    public String getFlyingD() {

        return Description;
    }
    public String getplayerf() {

        return player;
    }
}
