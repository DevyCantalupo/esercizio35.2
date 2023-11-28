public class esercizio35di2 {
    public static void main(String[] args) {
        BuilderPersona personaBuilder1 = new BuilderPersona("Devy", "Cantalupo");
        personaBuilder1.setEta(24);

        BuilderPersona personaBuilder2 = new BuilderPersona("Obi-Wan", "Kenobi");
        personaBuilder2.setEta(34);
        personaBuilder2.setIndirizzo("Coruscant");

        Persona persona1 = personaBuilder1.buildPersona();
        Persona persona2 = personaBuilder2.buildPersona();

        System.out.println("\n persona1 : " + persona1);
        System.out.println("\n persona2 : " + persona2);
        System.out.println("\n");
    }
}
