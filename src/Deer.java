class Deer implements Animal{
    // Art from https://www.asciiart.eu/animals/deer

    @Override
    public String getAnimalArt() {
        return "     \\   (             )\n" +
            "      \\    `--(_   _)--\'\n" +
            "       \\       Y-Y\n" +
            "        \\     /@@ \\\n" +
            "         \\   /     \\\n" +
            "             `--\'.  \\             ,\n" +
            "                 |   `.__________/)";
    }

    @Override
    public String toString() {
        return "deer";
    }
}
