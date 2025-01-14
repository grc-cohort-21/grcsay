/**
 * The Deer class represents a  and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Deer art sourced from https://www.asciiart.eu/animals/deer
 */
class Deer implements Animal {

    /**
     * Returns the ASCII art representation of the duck.
     *
     * @return A string containing the ASCII art of the duck.
     */
    @Override
    public String getAnimalArt() {
        return  "     \\   (             )\n" +
"      \\    `--(_   _)--\'\n" +
"       \\       Y-Y\n" +
"        \\     /@@ \\\n" +
"         \\   /     \\\n" +
"             `--\'.  \\             ,\n" +
"                 |   `.__________/)";
    }
  
    /**
     * Returns the name of the animal ("deer").
     * This method overrides the toString method to return the name of the duck.
     *
     * @return The string "deer" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "deer";
    }
  }
  