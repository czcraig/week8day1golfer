package models;

import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 39);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Phil", "Mickelson", 49);
        DBGolfer.save(golfer2);

        Golfer golfer3 = new Golfer("Rory", "Mcilroy", 25);
        DBGolfer.save(golfer3);

        Golfer golfer4 = new Golfer("Lee", "Westwood", 30);
        DBGolfer.save(golfer4);

        List<Golfer> golfers = DBGolfer.getAll();



    }

}

