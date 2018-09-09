package com.komen;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
/**
 * Het speelbord bestaat uit een grid van 10 x 10 vakjes, waar {@link Speelstuk}ken op kunnen staan van beide spelers.
 */
public class Bord {

    private static final List<Integer> NIET_BELOOPBARE_X_COORDINATEN = Arrays.asList(2, 3, 6, 7);
    private static final List<Integer> NIET_BELOOPBARE_Y_COORDINATEN = Arrays.asList(5, 6);

    @Builder.Default
    private List<Tegel> tegels = new ArrayList<>();

    /**
     * Construeer het bord door alle 100 {@link Tegel}s aan te maken. De tegel linksonder heeft tegels (0, 0).
     * De tegel rechtsboven heeft tegels (9,9).
     */
    public Bord() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tegels.add(maakTegel(x, y));
            }
        }
    }

    public int getAantalTegels() {
        return tegels.size();
    }

    public long getBeloopbareTegels() {
        return tegels.stream()
                .filter(Tegel::isBeloopbaar)
                .count();
    }

    public long getNietBeloopbareTegels() {
        return tegels.stream()
                .filter(t -> !t.isBeloopbaar())
                .count();
    }

    private Tegel maakTegel(int x, int y) {
        if (NIET_BELOOPBARE_X_COORDINATEN.contains(x) && NIET_BELOOPBARE_Y_COORDINATEN.contains(y)) {
            return maakNietBeloopbareTegel(x, y);
        } else {
            return maakWelBeloopbareTegel(x, y);
        }
    }

    private Tegel maakNietBeloopbareTegel(int x, int y) {
        return Tegel.builder()
                .xCoordinaat(x)
                .yCoordinaat(y)
                .beloopbaar(false)
                .build();
    }

    private Tegel maakWelBeloopbareTegel(int x, int y) {
        return Tegel.builder()
                .xCoordinaat(x)
                .yCoordinaat(y)
                .beloopbaar(true)
                .build();
    }
}
