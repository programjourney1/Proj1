package org.example;

public class Normal {
    public String Species;
    public String Description;
    public String player;


    public Normal(){}

    public Normal(String Species, String Description,String player) {
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

    public String getNormalS() {

        return Species;
    }
    public String getNormalD() {

        return Description;
    }
    public String getplayern() {

        return player;
    }
}
