package WahlauszaehlungTest;

import Wahlauszaehlung.WahlUrne;
import org.junit.jupiter.api.Assertions;

class WahlauszaehlungTest {

    WahlUrne wu;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void constructor() {
        wu.getWahlname();
    }

    @org.junit.jupiter.api.Test
    void waehlen() {


    }

    @org.junit.jupiter.api.Test
    void waehlbar() {
        wu.waehlbar(wu.getWahlname());
        Assertions.assertTrue(waehlen());
    }

    @org.junit.jupiter.api.Test
    void erhalteneStimmenAbsolut() {

    }

    @org.junit.jupiter.api.Test
    void gesamtAnzahlStimmen() {
    }

    @org.junit.jupiter.api.Test
    void erhalteneStimmenInProzent() {
    }
}