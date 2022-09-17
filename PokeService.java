package Service;

import DAO.PokeRepo;
import org.example.*;

import java.sql.SQLException;
import java.util.List;

public class PokeService {
    PokeRepo r;
    LocService ee;
    public PokeService()  {
        r = new PokeRepo();
        try {
            ee= new LocService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List <Poison> getPoison(){return r.getPoison();}
    public List<Flying> getFly(){return r.getFly();}
    public List<Normal> getNorm(){return r.getNorm();}
    public List<Bug> getBug(){return r.getBug();}

    public List <Poison> getPoisonr(){return r.getPoisonr();}
    public List<Flying> getFlyr(){return r.getFlyr();}
    public List<Normal> getNormr(){return r.getNormr();}
    public List<Bug> getBugr(){return r.getBugr();}
    //////////////////////add
    public void addNormal(String Species, String Description, String player){
     //   String existingLizard = r.getNorm(Species, Description);

        Normal newLizard = new Normal(Species, Description, player);
        r.addNormal(newLizard);}
    //////////////
    public void addFlying(String Species, String Description, String player){
      //  String existingCrocs = r.getCrocs(Species, Description);

        Flying newCroc = new Flying(Species, Description, player);
        r.addFlying(newCroc);}
    /////////
    public void addBug(String Species, String Description, String player){
      //  String existingSnake = r.getCrocs(Species, Description);

        Bug newSnake = new Bug(Species, Description, player);
        r.addBug(newSnake);}
    //////////
    public void addPoison(String Species, String Description, String player){
       // String existingTurtle = r.getTurtles(Species, Description);

        Poison newTurtle = new Poison(Species, Description, player);
        r.addPoison(newTurtle);}

/*
    public List <Loc> getLoc() {
        return r.getLoc();
    }

    public void addLoc(String species, String enviro) {
        Loc newEnviro= new Loc(species, enviro);
        r.addLoc(newEnviro);
    }
*/
    public List <Loc> getLocz() {
        return r.getLocz();
    }

    public void addLocz(String species, String enviro, String player) {
        Loc newEnviro= new Loc(species, enviro, player);
        r.addLocz(newEnviro);
    }

    public List <Loc> getLocza() {
        return r.getLocza();
    }

   /* public Object getAll(String Species) {
        return String.valueOf(r.getAll());
    }


    public Object getAll() {
        return String.valueOf( r.getAll());
    }
    */

}
