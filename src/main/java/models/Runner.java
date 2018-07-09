package models;

import db.DBGolfer;
import models.Golfer;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer= new Golfer("Tiger", "Woods", 39);
        DBGolfer.save(golfer);
    }
}

