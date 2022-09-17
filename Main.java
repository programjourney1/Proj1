package Util;
import java.sql.Connection;
import Service.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import org.example.*;

import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PokeService rts = new PokeService();
        Javalin app = Javalin.create(JavalinConfig::enableCorsForAllOrigins);
        app.start(9004);
        Connection conn = ConnUtil.getConnection();
        LocService rs;
        PokeService rr = new PokeService();
        ///////////////
        String cn;
        cn = ("Welcome to the world of Pokemon " + '\n' +
                "This Pokedex is divided into a number of sections." + '\n' + "You may input an entry or read previous entries \n " +
                "Poke-Search allows for a pokemon's location to be found or entered. \n" +
                "A full list off all Pokemon you have seen so far is also available ");
        app.get("/Pokemon/", ctx -> ctx.result(cn));
        /////////////////////Get by type
        app.get("/Pokemon/Poison/", ctx -> {
            ctx.json(rr.getPoison());
        });
        app.get("/Pokemon/Flying/", ctx -> {
            ctx.json(rr.getFly());
        });
        app.get("/Pokemon/Normal/", ctx -> {
            ctx.json(rr.getNorm());
        });
        app.get("/Pokemon/Bug/", ctx -> {
            ctx.json(rr.getBug());
        });

        app.get("/Pokemon/Poisonr/", ctx -> {
            ctx.json(rr.getPoisonr());
        });
        app.get("/Pokemon/Flyingr/", ctx -> {
            ctx.json(rr.getFlyr());
        });
        app.get("/Pokemon/Normalr/", ctx -> {
            ctx.json(rr.getNormr());
        });
        app.get("/Pokemon/Bugr/", ctx -> {
            ctx.json(rr.getBugr());
        });
        //////////////////////////addctx
       app.post("/Pokemon/Bug", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
            Bug requestBug = mapper.readValue(ctx.body(),Bug.class);
            rr.addBug(requestBug.getBugS(),requestBug.getBugD(),requestBug.getplayerb());
        });
        app.post("/Pokemon/Normal", ctx -> {
            ObjectMapper mapper1 = new ObjectMapper();
            Normal requestBug = mapper1.readValue(ctx.body(),Normal.class);
            rr.addNormal(requestBug.getNormalS(),requestBug.getNormalD(),requestBug.getplayern());
        });
        app.post("/Pokemon/Flying", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
            Flying requestBug = mapper.readValue(ctx.body(),Flying.class);
            rr.addFlying(requestBug.getFlyingS(),requestBug.getFlyingD(),requestBug.getplayerf());
        });
        app.post("/Pokemon/Poison", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
           Poison requestPoison = mapper.readValue(ctx.body(),Poison.class);
            rr.addPoison(requestPoison.getPoisonS(),requestPoison.getPoisonD(),requestPoison.getplayerp());
        });
        ////////////////////location
    /*    app.get("/Pokemon/Loc/", ctx -> {
            ctx.json(rr.getLoc());
        });
        app.post("/Pokemon/Loc", ctx -> {
            ObjectMapper mapper1 = new ObjectMapper();
           Loc requestBug = mapper1.readValue(ctx.body(), Loc.class);
            rr.addLoc(requestBug.getLocS(),requestBug.getLocD());
        }); */
/////////////////////////////
        app.get("/Pokemon/Locz/", ctx -> {
            ctx.json(rr.getLocz());
        });
        app.post("/Pokemon/Locz", ctx -> {
            ObjectMapper mapper1 = new ObjectMapper();
            Loc requestBug = mapper1.readValue(ctx.body(), Loc.class);
            rr.addLocz(requestBug.getLocS(),requestBug.getLocD(), requestBug.getId());
        });

        app.get("/Pokemon/Locza/", ctx -> {
            ctx.json(rr.getLocza());
        });

       // app.get("Pokemon/Bug/Species/{Species}", ctx->
      //  {ctx.json(rr.getBug(ctx.pathParam("Species")));});
   ////////////////////////Add
        /*
        System.out.println("You have selected to write an entry.");
        Scanner sk = new Scanner(System.in);
        Scanner skd = new Scanner(System.in);
        System.out.println("Select Type of Pokemon to add: 1= Normal, 2= Poison, 3= Flying, 4= Bug");
        int k;
        k = sk.nextInt();
        if(k== 1)
        {
            System.out.println("You have selected: Normal Pokemon \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addNormal(Species, Description);
        }
        else if (k== 2)
        { System.out.println("You have selected: Poison \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addPoison(Species, Description);
        }
        else if (k==3)
        { System.out.println("You have selected: Flying \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addFlying(Species, Description);
        }
        else if (k==4)
        { System.out.println("You have selected: Bug \n"+"Please Input Species, and press enter:");
            String Species = sk.next();
            System.out.println("Input Description");
            String Description = skd.nextLine();
            rts.addBug(Species, Description);
        }
        else{System.out.println("Not a valid input");} */
    }


    }
