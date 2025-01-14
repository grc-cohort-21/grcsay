/**
 * The Dog class represents a dog and provides its ASCII art.
 * This class implements the Animal interface and overrides
 * the getAnimalArt and toString methods.
 * 
 * Dog by Maija Haavisto.
 */

class Dog implements Animal {
    /**
     * Returns the ASCII art represnetation of the dog.
     * 
     * @return A string containing the ASCII art of the dog. 
     */
    @Override
    public String getAnimalArt() {
        return
        "        \\   .\n" +
        "         \\  ..^____/\n" +
        "            `-. ___ )\n" +
        "              ||   ||\n";
    }

    /**
     * Returns the name of the animal ("dog").
     * This method overrides the toString method to return the name of the dog.
     * 
     * @return The string "dog" representing the name of the animal.
     */
    @Override
    public String toString() {
        return "dog";
    }
}
