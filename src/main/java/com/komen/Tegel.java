package com.komen;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.NONE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
/**
 * Een Tegel is een vakje op het {@link Bord} waar een {@link Speelstuk} wel of niet op kan staan.
 */
public class Tegel {

    private int xCoordinaat;
    private int yCoordinaat;
    private boolean beloopbaar; // mag hier een Speelstuk op staan of lopen?
}
