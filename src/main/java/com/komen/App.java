package com.komen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        LOG.info("Begin met aanmaken van spelbord.");
        Bord speelbord = new Bord();

        LOG.info("Spelbord is aangemaakt met {} tegels. Van deze tegels zijn er {} beloopbaar en {} niet-beloopbaar.",
                speelbord.getAantalTegels(), speelbord.getBeloopbareTegels(), speelbord.getNietBeloopbareTegels());

    }
}
