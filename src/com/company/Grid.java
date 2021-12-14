package com.company;


import java.util.ArrayList;

public class Grid {
    ArrayList<ArrayList<Space>> rows = new ArrayList<ArrayList<Space>>();
    int playerX;
    int playerY;


    public Grid(int x, int y) {
        playerX = x;
        playerY = y;
        for (int i = 0; i<15; i++) {
            ArrayList<Space> thisList = new ArrayList<>();
            for (int j=0; j<15; j++) {
                Space thisSpace = new Space();
                if (i == playerY && j == playerX) {
                    thisSpace.addPlayer();
                }
                thisList.add(thisSpace);
            }
            rows.add(thisList);
        }
    }

    public void changePlayerY() {

    }

    public void changePlayerX() {

    }

    public void refreshGrid() {

    }

    @Override
    public String toString() {
        String result = "";
        for(ArrayList<Space> row: rows) {
            //Create a String representation of this row.
            result += row.toString() + "\n";
        }
        return result;
    }
}
