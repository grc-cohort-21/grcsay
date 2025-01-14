class Cat implements Animal {

    // Art from https://www.asciiart.eu/animals/cats
    @Override
    public String getAnimalArt() {
        return " |\\__/,|   (`\\\r\n" + //
                " |_ _  |.--.) )\r\n" + //
                " ( T   )     /\r\n" + //
                "(((^_(((/(((_/";
    }

    @Override
    public String toString() {
        return "cat";
    }

}
