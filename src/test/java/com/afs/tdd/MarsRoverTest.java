package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    // 00N -> 01N
    void shouldMoveForwardFromN_whenexecuteSingleCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "M";
        String expected = "0 1 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00S -> 0-1S
    @Test
    void shouldMoveForwardFromS_whenexecuteSingleCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "M";
        String expected = "0 -1 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00E -> 10E
    @Test
    void shouldMoveForwardFromE_whenexecuteSingleCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "M";
        String expected = "1 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00W -> -10W
    @Test
    void shouldMoveForwardFromW_whenexecuteSingleCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "M";
        String expected = "-1 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00N -> 00W
    @Test
    void shouldTurnLeftFromN_whenexecuteSingleCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "L";
        String expected = "0 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00S -> 00E
    @Test
    void shouldTurnLeftFromS_whenexecuteSingleCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "L";
        String expected = "0 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00E -> 00N
    @Test
    void shouldTurnLeftFromE_whenexecuteSingleCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "L";
        String expected = "0 0 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00W -> 00S
    @Test
    void shouldTurnLeftFromW_whenexecuteSingleCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "L";
        String expected = "0 0 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromN_whenexecuteSingleCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String command = "R";
        String expected = "0 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromS_whenexecuteSingleCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "R";
        String expected = "0 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void shouldTurnRightFromE_whenexecuteSingleCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "E";
        String command = "R";
        String expected = "0 0 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromW_whenexecuteSingleCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "W";
        String command = "R";
        String expected = "0 0 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeSingleCommand(command);
        //then
        assertEquals(expected,actual);
    }
    
    //New Test
    @Test
    void shouldMoveThreeTimes_whenexecuteSingleCommands_givenStartFromN(){
        int locationX = 0;
        int locationY = 0;
        String direction = "N";
        String commands = "MMM";
        String expected = "0 3 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        String actual = marsRover.executeBatchCommand(commands);

        assertEquals(expected,actual);

    }

}
