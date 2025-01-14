/**
 * The deer class represents a deer and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * deer by Tony Monroe. See license file for more details.
 */
class deer implements Animal {

  /**
   * Returns the ASCII art representation of the deer.
   *
   * @return A string containing the ASCII art of the deer.
   */
  @Override
  public String getAnimalArt() {
      return
        "     \\   (             )\n" +
        "      \\    `--(_   _)--\'\n" +
        "       \\       Y-Y\n" +
        "        \\     /@@ \\\n" +
        "         \\   /     \\\n" +
        "             `--\'.  \\             ,\n" +
        "                 |   `.__________/)";
  }

  /**
   * Returns the name of the animal ("deer").
   * This method overrides the toString method to return the name of the deer.
   *
   * @return The string "deer" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "deer";
  }
}
