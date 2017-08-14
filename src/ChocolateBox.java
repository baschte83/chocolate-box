/**
 * Organisation: University of applied sciences Munich, faculty 07
 * Project: lab to class software developement 1 Mrs. Prof. Dr. Hammerschall, WS 2016/2017
 * Author: Sebastian Baumann, sebastian_baumann@gmx.net
 * Study group: IF3A
 * Date: 19. November 2016
 * Purpose: solution to lab ChocolateBox
 */
class ChocolateBox {

    /**
     * Private constant to store the char representing a truffle chocolate.
     */
    private static final char TRUFFLE = 'C';

    /**
     * Private constant to store the char representing a nougat chocolate.
     */
    private static final char NOUGAT = 'S';

    /**
     * Private constant to store the char representing a brandy bean chocolate.
     */
    private static final char BEAN = 'W';

    /**
     * Private constant to store the capacity .
     */
    private static final int CAPACITY = 21;

    /**
     * Private constant to store how many chocolates are in a box from the start.
     */
    private static final int INITIAL_VALUE = 7;

    /**
     * Private variable to store the actual amount of truffle chocolates in this chocolate box.
     */
    private int truffle;

    /**
     * Private variable to store the actual amount of nougat chocolates in this chocolate box.
     */
    private int nougat;

    /**
     * Private variable to store the actual amount of brandy bean chocolates in this chocolate box.
     */
    private int bean;


    /**
     * Custom constructor of class chocolatebox.
     * @param full - boolean value if the box is full (true) or completely empty (false).
     */
    ChocolateBox(boolean full) {

        if (full) {

            this.truffle = INITIAL_VALUE;
            this.nougat = INITIAL_VALUE;
            this.bean = INITIAL_VALUE;

        }

        else {

            this.truffle = 0;
            this.nougat = 0;
            this.bean = 0;

        }

    }

    /**
     * Method to add a certain type of chocolate to this chocolate box object.
     * @param type - type of the chocolate (C for truffle, S for nougat, W for bean).
     * @param number - amount of chocolates to add to this chocolate box object.
     * @return - returns this chocolate box object, which has more chocoltes than before.
     */
    ChocolateBox add(char type, int number) {

        // A counter which helps to add new chocolates.
        int counter = number;


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

    /**
     * Method to remove an amount of chocolates of a certain type.
     * @param type - type of the chocolates that have to be removed.
     * @param number - amount of chocolates which have to be removed.
     * @return - returns a chocolate box which has less chocolates in it.
     */
    ChocolateBox remove(char type, int number) {

        // A counter which helps to remove chocolates.
        int counter = number;

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

    /**
     * Method to generate a String representation of this chocolate box object.
     * @return - returns a String representation of this chocolate box object.
     */
    public String toString() {

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
