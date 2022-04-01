public class Main {
    public static void main(String[] args) {

    }

    // Input
    // StringBuilder myName = new StringBuilder("domanokz");
    //  myName.setCharAt(4, 'x');
    public static boolean checkInput (String letter){
        String solution ="Guacamole";
        String solutionHidden ="_________";      // TODO: "___" should be dynamic
        int tries = 0;
        int positionOfRightGuess = solution.indexOf(letter);
        if (solution.contains(letter)){

         // HIER METHODE FÜR STRINGVERÄNDERUNG AUFRUFEN
        return true;}
        else {
            countWrongTries(tries, false);
            return false;
        }
    }

    // solve-method
    public static String solve(String solution, String solutionHidden, int positionOfRightGuess, String letter){
        StringBuilder newSolutionHidden = new StringBuilder(solutionHidden);
        newSolutionHidden.setCharAt(positionOfRightGuess, 'letter');
    }

    // count tries
    public static int countWrongTries (int tries, boolean solved){
        tries++;
        if (tries == 10 && !solved) {
            System.out.println("Vorbei!!");
        }
        return tries;
    }

}
