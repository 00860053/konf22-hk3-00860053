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
        wu.waehlbar(wu.getWahlname());
        Assertions.assertTrue(waehlen());

    }

    @org.junit.jupiter.api.Test
    boolean waehlenUngueltig() {
        wu.waehlen(waehlenUngueltig(););
        Assertions.assertFalse(waehlenUngueltig());

    }

    @org.junit.jupiter.api.Test
    void waehlbar() {
        Assertions.assertTrue(wu.waehlbar());

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