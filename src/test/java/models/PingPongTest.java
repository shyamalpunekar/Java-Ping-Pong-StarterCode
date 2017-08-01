package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by spunek on 7/31/17.
 */
public class PingPongTest {

    @Test
    public void runPingPong_countUToOne_ArrayList(){
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput , testPingPong.runPingPong(1));
    }

}