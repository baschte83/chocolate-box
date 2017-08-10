/**
 * Organisation: Hochschule Muenchen, Fakultaet 07
 * Project: Praktikum Softwareentwicklung 1 Frau Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, bauman21@hm.edu
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: Loesung Praktikumseinheit 04: ChocolateBox
 * Software: Oracle Java SE JDK 1.8.0_101, Windows 10 x86_64
 * Hardware: Intel Core i5-6300 @ 2.40 GHz 2.50 GHz, 2 Cores, 4096 MB RAM
 */

public class ChocolateBox {

    // Variablen -----------------------------------------------------
    // Definition der geforderten Konstanten
    private static final char TRUFFLE = 'C';    // Konstante fuer Champagner-Trueffel
    private static final char NOUGAT = 'S';     // Konstante fuer Schichtnougat
    private static final char BEAN = 'W';       // Konstante fuer Weinbrandbohnen
    private static final int CAPACITY = 21;     // Konstante fuer die Hoechstfuellmenge einer Pralinenschachtel

    // Definition der uebrigen Variablen
    private int truffle;    // Anzahl an Champagner-Trueffel
    private int nougat;     // Anzahl an Schichtnougat
    private int bean;       // Anzahl an Weinbrandbohnen


    // Custom-Konstruktor ---------------------------------------------
    ChocolateBox(boolean full) {

        // Es wird in jedem Fall eine leere Schachtel erzeugt, ausser wenn full mit true uebergeben wird
        if (full) {

            this.truffle = 7;
            this.nougat = 7;
            this.bean = 7;

        }

        else {

            this.truffle = 0;
            this.nougat = 0;
            this.bean = 0;

        }

    }

    // Methoden -------------------------------------------------------
    ChocolateBox add(char type, int number) {

        // Setzen eines Zaehlers zum hinzufuegen von Pralinen
        int counter = number;

        /**
         * Per while-Schleife wird nun zur entsprechenden Pralinensorte neue
         * Pralinen hinzugezaehlt. Das ganze funktioniert nur, wenn alle Pralinen
         * zusammen noch nicht die Hoechstmenge an Pralinen erreicht haben, wenn also
         * noch Platz in der Schachtel ist. Per switch wird innerhalb der Schleife
         * entschieden, zu welcher Sorte (was type vorgibt) neue Pralinen hinzugezaehlt
         * werden sollen. Da fuer type nur die Eingabe 'C', 'S' oder 'W' zulaessig ist,
         * muss eine gueltige Eingabe getestet werden.
         */

        if ((type == 'C') || (type == 'S') || (type == 'W')) {

            while (counter > 0) {

                if ((this.truffle + this.nougat + this.bean) < CAPACITY) {

                    switch (type) {

                        case 'C':
                            this.truffle += 1;
                            break;
                        case 'S':
                            this.nougat += 1;
                            break;
                        default:
                            this.bean += 1;

                    }

                    counter--;

                }

                else {

                    counter--;

                }

            }

        }

        else {

            System.out.println("Invalid type of praline.");

        }

        return this;

    }

    ChocolateBox remove(char type, int number) {

        // Setzen eines Zaehlers zum entfernen von Pralinen
        int counter = number;

        /**
         * In der while-Schleife werden nun Pralinen aus der Schachtel entfernt.
         * Es werden solange Pralinen entfernt, wie die Angabe number vorgibt und
         * solange es noch entsprechende Pralinen in der Schachtel gibt. Welche
         * Pralinen entfernt werden gibt type vor und wird per switch-Anweisung
         * geprueft. Da fuer type nur die Eingabe 'C', 'S' oder 'W' zulaessig ist,
         * muss eine gueltige Eingabe getestet werden.
         */
        if ((type == 'C') || (type == 'S') || (type == 'W')) {

            while (counter > 0) {

                switch (type) {

                    case 'C':
                        if (this.truffle > 0) {

                            this.truffle -= 1;

                        }
                        break;
                    case 'S':
                        if (this.nougat > 0) {

                            this.nougat -= 1;

                        }
                        break;
                    default:
                        if (this.bean > 0) {

                            this.bean -= 1;

                        }

                }

                counter--;

            }

        }

        else {

            System.out.println("Invalid type of praline.");

        }

        return this;

    }

    public String toString() {

        /**
         * Mit for-Schleifen fuer jeden Pralinentyp werden Pralinen-
         * Buchstaben zu einem neuen String "boxContent" hinzugefuegt.
         * Am Ende wird der String "boxContent" mit String.format() so
         * formatiert, dass der String innerhalb einer Klammer
         * ausgegeben wird.
         */
        String boxContent = "";

        for (int i = 0; i < truffle; i++) {

            boxContent += TRUFFLE;

        }

        for (int i = 0; i < nougat; i++) {

            boxContent += NOUGAT;

        }

        for (int i = 0; i < bean; i++) {

            boxContent += BEAN;

        }

        return String.format("(%s)", boxContent);

    }

}
