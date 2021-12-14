package com.company;

public class Space {
    String marker;
    String defaultMarker = "⬜";
    String palmTree = "\uD83C\uDF34";

    public Space() {
        marker = defaultMarker;
    }

    public String toString() {
        return marker;
    }

    public void addPlayer() {
        marker = "\uD83D\uDE32";
    }

    public void addLandscape() {
        int min = 1;
        int max = 10;
        int random_int =(int)Math.floor(Math.random()*(max-min+1)+min);
    }
    //if {int max = 3 ;}
    //public void removePlayer() {
        //marker = defaultMarker;
    //}

    public void addTreasure() { marker = "$";}

    public void removeTreasure() { marker = defaultMarker;}

    }

