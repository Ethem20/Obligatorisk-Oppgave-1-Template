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

    public static void sorter(int[] a, int fra, int til) {

        if (fra < 0 || til > a.length) {
            throw new IndexOutOfBoundsException("Ugyldig fra og til verdi.");
        }

        if (fra >= til) {
            return;
        }

        quicksort(a, fra, til - 1);
    }

    private static void quicksort(int[] a, int venstre, int høyre) {

        int i = venstre;
        int j = høyre;
        int pivot = a[venstre + (høyre - venstre) / 2];

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                bytt(a, i, j);
                i++;
                j--;
            }
        }
        if (venstre < j) {
            quicksort(a, venstre, j);
        }
        if (i < høyre) {
            quicksort(a, i, høyre);
        }
    }

    // Oppgave 5

     // Flytter først alle oddetall fremst i tabellen (partall bakerst),og sorterer så de to delene hver for seg med sorter()
    public static void delsortering(int[] a) {
        int grense = flyttOddetallFremst(a);
        sorter(a, 0, grense);
        sorter(a, grense, a.length);
    }

    private static int flyttOddetallFremst(int[] a) {
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) { // Negative tall funker
                bytt(a, i, j);
                i++;
            }
        }
        return i;
    }

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