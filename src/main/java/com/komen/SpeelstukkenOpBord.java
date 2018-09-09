package com.komen;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class SpeelstukkenOpBord {

    private TeamKleur teamKleur;
    private List<Speelstuk> speelstukken = new ArrayList<>();
    private List<Speelstuk> nogTeKiezenSpeelstukken = initSpeelstukken();

    public SpeelstukkenOpBord(Bord speelbord, TeamKleur teamKleur) {
        this.teamKleur = teamKleur;
        plaatsSpeelstukken(speelbord);
    }

    private void plaatsSpeelstukken(Bord speelbord) {
        for (int i = 0; i < nogTeKiezenSpeelstukken.size(); i++) {
            // @todo implement this
        }
    }

    private List<Speelstuk> initSpeelstukken() {
        List<Speelstuk> result = new ArrayList<>();
        result.add(maakVlag());
        result.add(maakSpion());
        result.addAll(Arrays.asList(maakVerkenner(), maakVerkenner(), maakVerkenner(), maakVerkenner(), maakVerkenner(),
                maakVerkenner(), maakVerkenner(), maakVerkenner()));
        result.addAll(Arrays.asList(maakMineur(), maakMineur(), maakMineur(), maakMineur(), maakMineur()));
        result.addAll(Arrays.asList(maakSergeant(), maakSergeant(), maakSergeant(), maakSergeant()));
        result.addAll(Arrays.asList(maakLuitenant(), maakLuitenant(), maakLuitenant(), maakLuitenant()));
        result.addAll(Arrays.asList(maakKapitein(), maakKapitein(), maakKapitein(), maakKapitein()));
        result.addAll(Arrays.asList(maakMajoor(), maakMajoor(), maakMajoor()));
        result.addAll(Arrays.asList(maakKolonel(), maakKolonel()));
        result.add(maakGeneraal());
        result.add(maakMaarschalk());
        result.addAll(Arrays.asList(maakBom(), maakBom(), maakBom(), maakBom(), maakBom(), maakBom()));

        return result;
    }

    private Speelstuk maakBom() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Bom)
                .status(SpeelstukStatus.Levend)
                .waarde(10)
                .kanBewegen(false)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakMaarschalk() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Maarschalk)
                .status(SpeelstukStatus.Levend)
                .waarde(9)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakGeneraal() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Generaal)
                .status(SpeelstukStatus.Levend)
                .waarde(8)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakKolonel() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Kolonel)
                .status(SpeelstukStatus.Levend)
                .waarde(7)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakMajoor() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Majoor)
                .status(SpeelstukStatus.Levend)
                .waarde(6)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakKapitein() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Kapitein)
                .status(SpeelstukStatus.Levend)
                .waarde(5)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakLuitenant() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Luitenant)
                .status(SpeelstukStatus.Levend)
                .waarde(5)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakSergeant() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Sergeant)
                .status(SpeelstukStatus.Levend)
                .waarde(4)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakMineur() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Mineur)
                .status(SpeelstukStatus.Levend)
                .waarde(3)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakVerkenner() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Verkenner)
                .status(SpeelstukStatus.Levend)
                .waarde(2)
                .kanBewegen(true)
                .magRennen(true)
                .build();
    }

    private Speelstuk maakVlag() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Vlag)
                .status(SpeelstukStatus.Levend)
                .waarde(0)
                .kanBewegen(false)
                .magRennen(false)
                .build();
    }

    private Speelstuk maakSpion() {
        return Speelstuk.builder()
                .naam(SpeelstukNaam.Spion)
                .status(SpeelstukStatus.Levend)
                .waarde(1)
                .kanBewegen(true)
                .magRennen(false)
                .build();
    }
}

