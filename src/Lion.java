/**
 * The Lion class represents a Lion and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Cow by Tony Monroe. See license file for more details.
 */
class Lion implements Animal 
{

  /**
   * Returns the ASCII art representation of the Lion.
   *
   * @return A string containing the ASCII art of the Lion.
   */
  @Override
  public String getAnimalArt() {
      return "            ^__^\n" +
             "          { (oo) }\\_______\n" +
             "           {(__)}\\       )\\/\\\n" +
             "                ||----w |\n" +
             "                ||     ||";
  }

  /**
   * Returns the name of the animal ("Lion").
   * This method overrides the toString method to return the name of the Lion.
   *
   * @return The string "Lion" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "Lion";
  }
}
