class Deer implements Animal {

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
        return "Deer";
    }
}
