package com.company;
import java.util.Objects;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

//        System.out.println(" ");
//        System.out.println("Welcome to: Find The gold!");
//        SECONDS.sleep(2);
//        System.out.println(" ");
//
//        System.out.println("You are standing in the middle of a beach. There is one hundred feet of sand on every side of you.");
//        System.out.println("There is gold buried somewhere on this beach! ");
//        SECONDS.sleep(4);
//        System.out.println("Search the beach and dig up the buried gold!");
//        System.out.println("When you get close to the treasure the medal detector will show how far away the treasure is. ");
//        SECONDS.sleep(4);
//        System.out.println(" ");
//
//        System.out.println("You can move either left, right, forwards, or backwards.");
//        SECONDS.sleep(3);
//        System.out.println("Enter how many feet you would like to move after you enter the direction you would like to move.");
//        System.out.println(" ");
//        SECONDS.sleep(3);
//
//        System.out.println("For example: ");
//        System.out.println(" ");
//        System.out.println("left ");
//        System.out.println("19 ");
//        System.out.println("Would move you 19 feet to your left.");
//        SECONDS.sleep(5);
//
//        System.out.println("Now search for treasure! ");
//        System.out.println(" ");

        Grid grid = new Grid(10, 10);

        System.out.println(grid);

        String playerMove = scan.nextLine();

        if (playerMove == "up"){
            grid.playerY += 5;
            System.out.println(grid);}

        if (playerMove == "down"){
            grid.playerY -= 5;
            System.out.println(grid);}

        if (playerMove == "left"){
            grid.playerX -= 5;
            System.out.println(grid);}

        if (playerMove == "right"){
            grid.playerX += 5;
            System.out.println(grid);}


        }

    }



