package org.example;

public class Bug {
    public String Species;
    public String Description;
    public String player;
public Bug(){}

    public Bug(String Species, String Description,String player) {
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
    public String getBugS() {

        return Species;
    }
    public String getBugD() {

        return Description;
    }
    public String getplayerb() {

        return player;
    }
}
