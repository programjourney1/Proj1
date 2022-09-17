package org.example;

import DAO.PokeRepo;

import java.sql.SQLException;
import java.util.List;

public class Loc {
    public String player;
    public String Species;
    public String Loc;


    public Loc(){}
    //public Loc(){}
    //public Loc(String Species, String Loc ) {
      //  this.Species = Species;
      //  this.Loc = Loc;}
    public Loc(String Species, String Loc, String player ) {
        this.Species = Species;
        this.Loc = Loc;
        this.player = player;}

   // public Loc(String species, String enviro, String player) {
    //}

    @Override
    public String toString() {
        return Species + " for:" +Loc;
    }
    public String getLocS() {
        return Species;
    }

   public String getLocD() {
       return Loc;
    }
    public String getId() {
        return player;
    }
}
