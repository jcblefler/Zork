package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void room(int roomNumber){
        String direction = "";
        String roomName = "";
        String roomContent = "";

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int roomSecret = rand.nextInt(5);
        int ghost = rand.nextInt(5);
        String userInput;
        boolean house = true;

//        ArrayList<Integer> roomNext = new ArrayList<Integer>();

        switch (roomNumber) {
            case 1: roomName = "Foyer";
                    roomContent = "a Dead Scorpion";
                    direction = "North";
                break;
            case 2: roomName = "Front Room";
                    roomContent = "a Piano";
                    direction = "South, East, West";
                break;
            case 3: roomName = "Library";
                    roomContent = "Spiders";
                    direction = "North, East";
                break;
            case 4: roomName = "Kitchen";
                    roomContent = "Bats";
                    direction = "North, West";
                break;
            case 5: roomName = "Dining Room";
                    roomContent = "Dust and an Empty Box";
                    direction = "South";
                break;
            case 6: roomName = "Vault";
                    roomContent = "3 Walking Seletons";
                    direction = "East";
                break;
            case 7: roomName = "Parlor";
                roomContent = "a Treasure Chest";
                direction = "West, South";
                break;
            case 8: roomName = "Secret";
                    roomContent = "Piles of Gold";
                    direction = "West";
                break;
        }

        System.out.println("\nYou are in the " + roomName + " room.");
        System.out.println("You see " + roomContent + ".");
        System.out.println("You can go " + direction + " or leave the house.");
        if (roomNumber == 6 && roomSecret == 4){
            System.out.println("You found a secret room. Type (Enter)");
        }
        System.out.print("Where will you go?\n(" + direction + " or Run) : ");

        while (house == true){

            userInput = keyboard.nextLine();

            if (roomNumber == 1){
                if (userInput.equalsIgnoreCase("north")){
                    room(2);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }

            if (roomNumber == 2){

                if (userInput.equalsIgnoreCase("south")){
                    room(1);
                }
                else if (userInput.equalsIgnoreCase("west")){
                    room(3);
                }
                else if (userInput.equalsIgnoreCase("east")){
                    room(4);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 3){

                if (userInput.equalsIgnoreCase("north")){
                    room(5);
                }
                else if (userInput.equalsIgnoreCase("east")){
                    room(2);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 4){

                if (userInput.equalsIgnoreCase("north")){
                    room(7);
                }
                else if (userInput.equalsIgnoreCase("west")){
                    room(2);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 5){

                if (userInput.equalsIgnoreCase("south")){
                    room(3);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 6){


                if (userInput.equalsIgnoreCase("east")){
                    room(7);
                }
                else if (userInput.equalsIgnoreCase("enter") && roomSecret == 4){
                    room(8);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 7){

                if (userInput.equalsIgnoreCase("west")){
                    room(6);
                }
                else if (userInput.equalsIgnoreCase("south")){
                    room(4);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }
            if (roomNumber == 8){

                if (userInput.equalsIgnoreCase("west")){
                    room(6);
                }
                else if (userInput.equalsIgnoreCase("run")){
                    house = false;
                }
                else {
                    System.out.println("Please input again.");
                }
            }

            if (ghost == 4){
                System.out.println("\nThere is a ghost following you!");
            }

            System.out.print("\nYou left the house and visited " + " of 8 rooms.");
        }


    }

    public static void main(String[] args) {



        room(6);








    }




}
