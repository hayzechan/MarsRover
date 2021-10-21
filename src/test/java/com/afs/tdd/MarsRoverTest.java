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
        String direction = "N";
        String command = "M";
        String expected = "0 1 N";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void shouldMoveForwardFromS_whenExecuteCommand_givenStartFromS() {
        //given
        int locationX = 0;
        int locationY = 0;
        String direction = "S";
        String command = "M";
        String expected = "0 -1 S";

        MarsRover marsRover = new MarsRover(locationX, locationY, direction);

        //when
        String actual = marsRover.executeCommand(command);
        //then
        assertEquals(expected,actual);
    }
}
