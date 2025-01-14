public class Dog implements Animal {
  
/**
 * The Dog class represents a dogand provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 */

 
  /**
   * Returns the ASCII art representation of the dog.
   *
   * @return A string containing the ASCII art of the cow.
   */
  @Override
  public String getAnimalArt() {
      return 
      "/ \\__\n"+ 
      "(    @\\___\n" +
      "/         O\n" +
     "/   (_____/\n" +
    "/_____/";
  }

  /**
   * Returns the name of the animal ("dog").
   * This method overrides the toString method to return the name of the cow.
   *
   * @return The string "cow" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "dog";
  }
}
