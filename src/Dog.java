/**
 * The Dog class represents a dog and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * dog art sourced from https://www.asciiart.eu/animals/birds-water
 */
class Dog implements Animal 
{
    /**
     * Returns the ASCII art representation of the dog.
     *
     * @return A string containing the ASCII art of the dog.
     */
    @Override
    public String getAnimalArt() 
    {
//By Maija Haavisto https://www.asciiart.eu/animals/dogs

return    "        \\   .\n" +
          "         \\  ..^____/\n" +
          "            `-. ___ )\n" +
          "              ||   ||\n";
    }
  
    /**
     * Returns the name of the animal ("Dog").
     * This method overrides the toString method to return the name of the dog.
     *
     * @return The string "dog" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "dog";
    }
  }
  