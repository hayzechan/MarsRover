package com.afs.tdd;

public class MarsRover {

    int locationX, locationY;
    String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public String executeBatchCommand(String commands){
        for(int i=0; i<commands.length(); i++){
            executeCommand("" + commands.charAt(i));
        }

        return String.format("%d %d %s",locationX,locationY,direction);
    }

    public String executeSingleCommand(String command){
        executeCommand(command);
        return String.format("%d %d %s",locationX,locationY,direction);
    }

    private void executeCommand(String command){
        switch (command){
            case "M":
                move();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
                break;
        }
    }

    public void move(){
        switch (this.direction){
            case "N":
                this.locationY += 1;
                break;
            case "S":
                this.locationY -= 1;
                break;
            case "E":
                this.locationX += 1;
                break;
            case "W":
                this.locationX -= 1;
                break;
            default:
                break;
        }
        //if(this.direction.equals("N")) this.locationY += 1;
        }

    public void turnLeft(){
        switch(this.direction){
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
            case "W":
                this.direction = "S";
        }
    }
    public void turnRight(){
        switch (this.direction){
            case "N":
                this.direction = "E";
                break;
            case "S":
                this.direction = "W";
                break;
            case "E":
                this.direction = "S";
                break;
            case "W":
                this.direction = "N";
                break;
            default:
                break;
        }
    }
}

