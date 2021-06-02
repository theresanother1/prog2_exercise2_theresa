package trafficlight.gui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.State;

import java.awt.*;
import java.util.NoSuchElementException;

public class TrafficLightGuiTest {
    private TrafficLightGui myTestGui;
    private TrafficLightCtrl myTestCtrl;
    private TrafficLight myTestLight1;
    private TrafficLight myTestLight2;
    private TrafficLight myTestLight3;


    @BeforeEach
    void setup(){
        myTestCtrl = TrafficLightCtrl.getInstance();
        myTestGui = new TrafficLightGui(myTestCtrl);
    }

    @Test
    @DisplayName("A Light is not implemented with a valid color.")
    public void testForTrafficLights(){
        assertThrows(NullPointerException.class, () -> new TrafficLight(null));
    }


}