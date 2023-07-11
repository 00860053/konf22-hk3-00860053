package change_me;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WahlUrne {

    private String wahlname;
    private Map<String, Integer> wahlstimmen = new HashMap<>();

    public WahlUrne(String wahlname, List<String> wahlmoeglichkeiten) {
        this.wahlname = wahlname;
        for (String kandidat : wahlmoeglichkeiten) {
            wahlstimmen.put(kandidat, 0);
        }
        wahlstimmen.put("ungueltig", 0);
    }

    public String getWahlname() {
        return wahlname;
    }

    public Map<String, Integer> getWahlstimmen() {
        return wahlstimmen;
    }

    /**
     * erhöht die Anzahl der Stimmen um 1, sofern in die übergebene
     * wahlmoeglichkeit in der Map ist (sprich waehlbar ist)
     * ansonsten wird der Wert bei "ungueltig" um 1 erhöht
     *
     * @param wahlmoeglichkeit für wen abgestimmt werden soll
     */
    public void waehlen(String wahlmoeglichkeit) {
        if (waehlbar(wahlmoeglichkeit)) {
            Integer stimmen = wahlstimmen.get(wahlmoeglichkeit);
            wahlstimmen.put(wahlmoeglichkeit, stimmen + 1);
        }

        //todo: wenn nicht waehlbar, dann ungueltig um 1 erhöhen
    }

    /**
     * es wird ermittelt, ob die @wahlmoeglichkeit auch in der Liste
     * der Kandidaten zu finden ist
     *
     * @param wahlmoeglichkeit der/die gewünschte Kandidat/Kandidatin
     * @return true, wenn wahlmoeglichkeit in @wahlmoeglichkeiten
     */
    public boolean waehlbar(String wahlmoeglichkeit) {
        return wahlstimmen.containsKey(wahlmoeglichkeit);
    }

    /**
     * gibt die Anzahl der erhaltenen Stimmen der gewünschten @wahlmoeglichkeit retour
     *
     * @param wahlmoeglichkeit der/die gewünschte Kandidat/Kandidatin
     * @return die Anzahl der erhaltenen Stimmen
     */
    public int erhalteneStimmenAbsolut(String wahlmoeglichkeit) {
        if (waehlbar(wahlmoeglichkeit)) {
            return wahlstimmen.get(wahlmoeglichkeit);
        }
        return 0;
    }

    /**
     * eruiert, wie viele Stimmen in Summe abgegeben wurden
     *
     * @return Gesamtanzahl aller abegegeben Stimmen (inkl. ungueltig)
     */
    public int gesamtAnzahlStimmen() {
        int stimmenGesamt = 0;
        for (int stimmen : wahlstimmen.values()) {
            stimmenGesamt = stimmen;
        }
        return stimmenGesamt;
    }

    /**
     * Prozentueller Anteil an erhaltenen Stimmen für die @wahlmoeglichkeit
     *
     * @param wahlmoeglichkeit der/die gewünschte Kandidat/Kandidatin
     * @return erhaltene Stimmen im Verhältnis zu den Gesamtstimmen
     */
    public double erhalteneStimmenInProzent(String wahlmoeglichkeit) {
        if (waehlbar(wahlmoeglichkeit)) {
            return (double) erhalteneStimmenAbsolut(wahlmoeglichkeit) / gesamtAnzahlStimmen();
        }
        return 0.0;
    }
}
