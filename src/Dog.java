/**
 * The Animal interface represents any animal that can be displayed as ASCII art.
 * Classes implementing this interface should provide their specific animal artwork
 * and override the toString method to return the name of the animal.
 */
class Dog implements Animal {

    /**
     * Returns the ASCII art representation of the animal.
     *
     * @return A string containing the ASCII art of the animal.
     */
    @Override
    public String getAnimalArt() 
    {
        return "        \\   .\n" +
                "         \\  ..^____/\n" +
                "            `-. ___ )\n" +
                "              ||   ||\n";

    }
  
    /**
     * Implementing classes should override the toString method to return the
     * name of the animal.
     *
     * @return The name of the animal.
     */
    @Override
    public String toString()
    {
        return "dog";
    }
  }