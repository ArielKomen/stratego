package com.komen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    private Bord speelbord;

    public static void main(String[] args) {

        App app = new App();
        app.aanmakenSpeelbord();
        app.klaarzettenSpeelstukkenOpBord();

    }

    private void aanmakenSpeelbord() {
        LOG.info("Begin met aanmaken van spelbord.");
        speelbord = new Bord();

        LOG.info("Spelbord is aangemaakt met {} tegels. Van deze tegels zijn er {} beloopbaar en {} niet-beloopbaar.",
                speelbord.getAantalTegels(), speelbord.getBeloopbareTegels(), speelbord.getNietBeloopbareTegels());
    }

    private void klaarzettenSpeelstukkenOpBord() {
        LOG.info("Begin met klaarzetten speelstukken.");
        SpeelstukkenOpBord speelstukkenOpBordRood = new SpeelstukkenOpBord(speelbord, TeamKleur.Rood);
        SpeelstukkenOpBord speelstukkenOpBordBlauw = new SpeelstukkenOpBord(speelbord, TeamKleur.Blauw);
    }
}
