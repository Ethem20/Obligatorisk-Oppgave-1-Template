package no.oslomet.cs.algdat;

import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;
    }

    // Oppgave 1
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tom tabell, ingen største verdi!");
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                bytt(a, i, i + 1);
            }
        }
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                bytt(a, i, i+1);
                antall++;
            }
        }
        return antall;
    }
    // Oppgave 2

     //Går gjennom tabellen en gang. Kaster feil hvis den ikke er sortert.
     //Teller opp antall ganger verdien endrer seg fra en plass til neste.

    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) return 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Tabellen er ikke sortert i stigenderekkefølge");
            }
        }

        int antall = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                antall++;
            }
        }
        return antall;
    }


    // Oppgave 3

     // For hvert element ser vi bakover i tabellen for å se om vi har sett verdien før. Har vi ikke det er det en ny, ulik verdi.
     // Bruker ikke hjelpetabeller, bare vanlige tellevariabler.

    public static int antallUlikeUsortert(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length; i++) {
            boolean settFor = false;
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    settFor = true;
                    break;
                }
            }
            if (!settFor) antall++;
        }
        return antall;
    }

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}

    //La til bytt funksjon
    private static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}