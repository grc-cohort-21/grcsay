// ASCII Art By Maija Haavisto https://www.asciiart.eu/animals/dogs

class Dog implements Animal
{
     @Override
     public String getAnimalArt()
     {
          return "        \\   .\n" +
"         \\  ..^____/\n" +
"            `-. ___ )\n" +
"              ||   ||\n";
     }

     @Override
     public String toString()
     {
          return "dog";
     }

}
