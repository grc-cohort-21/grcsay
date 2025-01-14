/**
 * The Duck class represents a duck and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Duck art sourced from https://www.asciiart.eu/animals/birds-water
 */
class Wolf implements Animal {

    /**
     * Returns the ASCII art representation of the duck.
     *
     * @return A string containing the ASCII art of the duck.
     */
    @Override
    public String getAnimalArt() {
        return  "                     .\r\n" + //
                        "                    / V\\\r\n" + //
                        "                  / `  /\r\n" + //
                        "                 <<   |\r\n" + //
                        "                 /    |\r\n" + //
                        "               /      |\r\n" + //
                        "             /        |\r\n" + //
                        "           /    \\  \\ /\r\n" + //
                        "          (      ) | |\r\n" + //
                        "  ________|   _/_  | |\r\n" + //
                        "<__________\\______)\\__)";
                        // ASCII Credit to https://www.asciiart.eu/animals/wolves
    }
  
    /**
     * Returns the name of the animal ("wolf").
     * This method overrides the toString method to return the name of the duck.
     *
     * @return The string "wolf" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "wolf";
    }
  }
  