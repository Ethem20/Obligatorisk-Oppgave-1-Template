# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* Erol Ethem Erdem, ererd6589@oslomet.no

## Arbeidsfordeling
I oppgaven har jeg hatt følgende arbeidsfordeling:
-  Erol Ethem Erdem har ansvar for oppgave  0, 1, 2, 3, 4, 5, 6, og 8


## Oppgavebeskrivelser

### Oppgave 1
I oppgave 1 gikk jeg frem ved å bruke algoritmen fra oppgaveteksten jeg går gjennom tabellen en gang og sammenligner to og to naboelementer og bytter dem hvis det første er størst. Etter at hele tabellen er gått gjennom, ligger den største verdien bakerst, og den returneres. ombyttinger bruker samme metode, men teller antall bytter i stedet for å returnere maks verdien. Antall sammenligninger blir alltid n-1. Færrest ombyttinger 0 får man når tabellen allerede er sortert stigende og flest (n-1) får man når tabellen er sortert mot bun. Gjennomsnittlig antall ombyttinger fant jeg ved å teste ombyttinger() på mange tilfeldige tabeller.

### Oppgave 2
I oppgave 2 gikk jeg frem ved å først sjekke om tabellen er sortert stigende ved å gå gjennom den og se om noe element er større enn det neste. Er den ikke sortert kaster jeg en exception. Er den sortert teller jeg opp hvor mange ganger verdien endrer seg fra en plass til den neste, og det gir antall ulike verdier.
### Oppgave 3
I oppgave 3 gikk jeg frem ved å se på hvert element i tabellen, se bakover på alle elementene før det og sjekke om verdien har dukket opp tidligere. Har den ikke det, teller jeg den som en ny ulik verdi. Jeg bruker ingen hjelpetabeller, bare vanlige tellevariabler, slik at jeg oppfyller kravene i oppgaven

### Oppgave 4
I oppgave 4 gikk jeg frem ved å bruke quicksort til å sortere intervallet (fra, til). Quicksort velger et pivot element, flytter alt som er mindre enn pivot til venstre og alt som er større til høyre, og gjør dette rekursivt på de to delene. Jeg bytter inn et tilfeldig pivot element for å unngå at algoritmen blir treg på visse tabeller. Metoden kaster Exception hvis fra er negativ eller til er større enn tabellens lengde.

### Oppgave 5
I oppgave 5 gikk jeg frem ved å først flytte alle oddetall fremst i tabellen og alle partall bakerst, ved å bytte plass på elementer mens jeg går gjennom tabellen en gang. Deretter bruker jeg sorter()metoden fra oppgave 4 på hver av de to delene for seg, slik at oddetallene blir sortert stigende til venstre og partallene sortert stigende til høyre.

### Oppgave 6
I oppgave 6 gikk jeg frem ved å ta det siste elementet i tabellen og huske det i en variabel, deretter skyve alle de andre elementene ett hakk til høyre, og til slutt sette det huskede elementet først i tabellen.

### Oppgave 8
I oppgave 8 brukte jeg 2 metoder, i den første metoden, gikk jeg gjennom begge strengene samtidig og legge til ett tegn fra hver streng etter tur, helt til en av dem er tom. Resten av den lengste strengen limte jeg på til slutt. I den andre metoden gjorde jeg det samme, men for flere strenger: jeg går gjennom "bokstavplass for bokstavplass", og for hver plass går jeg gjennom alle strengene og legger til bokstaven hvis strengen fortsatt har en bokstav der.
