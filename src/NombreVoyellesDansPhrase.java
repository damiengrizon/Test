public class NombreVoyellesDansPhrase {

    /**
     * Comme l'indique le nom de la Class, l'exercice ici consiste à compter et donner le nombre puis le pourcentage
     * dans une chaîne de caractères
     * @param args ...
     */
    public static void main(String[] args) {
      String text = " A wonderful string that consist of multiple characters";
      String text2 = "pappa";
      int nbOfVowels = 0;
      double percentageOfVowels;


    //methode qui transforme le texte en tableau de lettres et les affichent

    char[] allLetters = text.toCharArray();
    for(char letter : allLetters){
        System.out.print("[" + letter + "]");
    }

    //methode qui compare les lettres avec des voyelles et qui incrémente la variable nbOfVowels

        for (char letter : allLetters) {
            if ("aeiouyAEIOUY".contains(Character.toString(letter))){
                nbOfVowels ++;
                System.out.println(letter);


            }
        } System.out.println("Le nombre dr voyelles dans la phrase est de " + nbOfVowels);
    // donne le pourcentage de voyelle dans le texte
        System.out.println(nbOfVowels);
        System.out.println(allLetters.length);

        percentageOfVowels = ((double)nbOfVowels/allLetters.length)*100;
        System.out.println("Le pourcentage de voyelles est de " + percentageOfVowels);
    }

}
