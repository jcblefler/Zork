package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int roomSecret= rand.nextInt(5);
        int ghost = rand.nextInt(5);
        boolean revealed =false;
        int inRoom;
        String userInput;
        boolean house = true;
        int roomCount = 0;

        HashMap<Integer, Boolean> roomsVisited = new HashMap<Integer, Boolean>();
        roomsVisited.put(1, false);
        roomsVisited.put(2, false);
        roomsVisited.put(3, false);
        roomsVisited.put(4, false);
        roomsVisited.put(5, false);
        roomsVisited.put(6, false);
        roomsVisited.put(7, false);
        roomsVisited.put(8, false);




        if (roomSecret == 4){
            revealed = true;
        }


        Room room1 = new Room();
        room1.setRoomNumber(1);
        room1.setRoomName("Foyer");
        room1.setRoomContent("a Dead Scorpion");
        room1.setDirection("North");
        room1.setRoomMoney(rand.nextInt(1001));

        Room room2 = new Room();
        room2.setRoomNumber(2);
        room2.setRoomName("Front Room");
        room2.setRoomContent("Piano");
        room2.setDirection("South, East, West");

        Room room3 = new Room();
        room3.setRoomNumber(3);
        room3.setRoomName("Library");
        room3.setRoomContent("Spiders");
        room3.setDirection("North, East");

        Room room4 = new Room();
        room4.setRoomNumber(4);
        room4.setRoomName("Kitchen");
        room4.setRoomContent("Bats");
        room4.setDirection("North, West");

        Room room5 = new Room();
        room5.setRoomNumber(5);
        room5.setRoomName("Dining Room");
        room5.setRoomContent("Dust and an Empty Box");
        room5.setDirection("South");

        Room room6 = new Room();
        room6.setRoomNumber(6);
        room6.setRoomName("Vault");
        room6.setRoomContent("3 Walking Skeletons");
        room6.setDirection("East");

        Room room7 = new Room();
        room7.setRoomNumber(7);
        room7.setRoomName("Parlor");
        room7.setRoomContent("Treasure Chest");
        room7.setDirection("West, South");

        Room room8 = new Room();
        room8.setRoomNumber(8);
        room8.setRoomName("Secret Room");
        room8.setRoomContent("Piles of Gold");
        room8.setDirection("West");


        inRoom = room1.currentRoom();

        while (house) {



            if (inRoom == 1) {
                System.out.println(room1.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(1, true);

                if (userInput.equalsIgnoreCase("north")){
                    inRoom = 2;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 2){
                System.out.println(room2.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(2, true);


                if (userInput.equalsIgnoreCase("south")){
                    inRoom = 1;
                }
                else if (userInput.equalsIgnoreCase("west")){
                    inRoom = 3;
                }
                else if (userInput.equalsIgnoreCase("east")){
                    inRoom = 4;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 3){
                System.out.println(room3.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(3, true);


                if (userInput.equalsIgnoreCase("north")){
                    inRoom = 5;
                }
                else if (userInput.equalsIgnoreCase("east")){
                    inRoom = 2;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 4){
                System.out.println(room4.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(4, true);


                if (userInput.equalsIgnoreCase("north")){
                    inRoom = 7;
                }
                else if (userInput.equalsIgnoreCase("west")){
                    inRoom = 2;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 5){
                System.out.println(room5.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(5, true);


                if (userInput.equalsIgnoreCase("south")){
                    inRoom = 3;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 6 && revealed == true){
                System.out.println("\nYou see a secret room. Input Enter.");
                System.out.println(room6.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(6, true);


                if (userInput.equalsIgnoreCase("east")){
                    inRoom = 7;
                }
                else if (userInput.equalsIgnoreCase("enter")){
                    inRoom = 8;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 6 && revealed == false){
                System.out.println(room6.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(6, true);


                if (userInput.equalsIgnoreCase("east")){
                    inRoom = 7;
                }
                else if (userInput.equalsIgnoreCase("enter") && revealed){
                    inRoom = 8;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 7){
                System.out.println(room7.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(7, true);


                if (userInput.equalsIgnoreCase("west")){
                    inRoom = 6;
                }
                else if (userInput.equalsIgnoreCase("south")){
                    inRoom = 4;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (inRoom == 8){
                System.out.println(room8.displayMessage());
                userInput = keyboard.nextLine();
                roomsVisited.replace(8, true);


                if (userInput.equalsIgnoreCase("west")){
                    inRoom = 6;
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
        }

        for (boolean value : roomsVisited.values()) {
            if (value == true){
                roomCount++;
            }

        }
        if (ghost == 4){
                System.out.println("\nThere is a ghost following you!");
        }

        System.out.print("\nYou left the house and visited " + roomCount + " of 8 rooms.");

    }
}
