package com.komen;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.NONE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Speelstuk {

    private int waarde;
    private SpeelstukNaam naam;
    private int id;
    private SpeelstukStatus status;
    private Tegel positie;
    private boolean kanBewegen;
    private boolean magRennen;
}

