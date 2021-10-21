package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    // 00N -> 01N
    void shouldMoveForwardFromN_whenExecuteCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 1 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00S -> 0-1S
    @Test
    void shouldMoveForwardFromS_whenExecuteCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 -1 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00E -> 10E
    @Test
    void shouldMoveForwardFromE_whenExecuteCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "1 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00W -> -10W
    @Test
    void shouldMoveForwardFromW_whenExecuteCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "-1 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00N -> 00W
    @Test
    void shouldTurnLeftFromN_whenExecuteCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00S -> 00E
    @Test
    void shouldTurnLeftFromS_whenExecuteCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00E -> 00N
    @Test
    void shouldTurnLeftFromE_whenExecuteCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    //00W -> 00S
    @Test
    void shouldTurnLeftFromW_whenExecuteCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromN_whenExecuteCommand_givenStartFromN() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 E";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromS_whenExecuteCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 W";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void shouldTurnRightFromE_whenExecuteCommand_givenStartFromE() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldTurnRightFromW_whenExecuteCommand_givenStartFromW() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "";
        String command = "";
        String expected = "0 0 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }

}
