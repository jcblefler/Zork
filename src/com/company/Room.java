package com.company;

public class Room {

    private int roomNumber;
    private int roomMoney;
    private String roomName;
    private String roomContent;
    private String direction;


    public int currentRoom(){
        return roomNumber;
    }




    public String displayMessage(){
        return
                "\nYou are in the " + roomName + " room.\nYou see " +
                roomContent + ".\nYou can go " + direction +
                " or leave the house.\nWhere will you go?\n(" + direction + " or Run): ";

    }



    public Room(){

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomMoney() {
        return roomMoney;
    }

    public void setRoomMoney(int roomMoney) {
        this.roomMoney = roomMoney;
    }

    public String getRoomContent() {
        return roomContent;
    }

    public void setRoomContent(String roomContent) {
        this.roomContent = roomContent;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
//switch (roomNumber) {
//        case 1:
//        roomName = "Foyer";
//        roomContent = "a Dead Scorpion";
//        direction = "North";
//        break;
//        case 2:
//        roomName = "Front Room";
//        roomContent = "a Piano";
//        direction = "South, East, West";
//        break;
//        case 3:
//        roomName = "Library";
//        roomContent = "Spiders";
//        direction = "North, East";
//        break;
//        case 4:
//        roomName = "Kitchen";
//        roomContent = "Bats";
//        direction = "North, West";
//        break;
//        case 5:
//        roomName = "Dining Room";
//        roomContent = "Dust and an Empty Box";
//        direction = "South";
//        break;
//        case 6:
//        roomName = "Vault";
//        roomContent = "3 Walking Skeletons";
//        direction = "East";
//        break;
//        case 7:
//        roomName = "Parlor";
//        roomContent = "a Treasure Chest";
//        direction = "West, South";
//        break;
//        case 8:
//        roomName = "Secret";
//        roomContent = "Piles of Gold";
//        direction = "West";
//        break;
//        }
//
//        return roomName;
//        return roomContent;
//        return direction;