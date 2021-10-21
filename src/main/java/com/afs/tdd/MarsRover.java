package com.afs.tdd;

public class MarsRover {

    int locationX, locationY;
    String direction;
    String command;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }
    public String executeCommand(String command){
         //if(command.equals("M")) move();
         move();
         return String.format("%d %d %s",locationX,locationY,direction);
    }

    public void move(){
        this.direction = "N";
        this.locationY += 1;
    }



}

