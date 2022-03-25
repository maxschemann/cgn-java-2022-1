public class Main {
    public static void main(String[] args) {
       String pwEntered="TEstpass46";
       checkLength(pwEntered);
       checkNumbers(pwEntered);
       checkUpperCase(pwEntered);
       checkBadPW(pwEntered, "Klaus Kinski", "31061912");
    }

    public static boolean checkLength(String pwEntered) {
        if (pwEntered.length() >= 8) return true;
        else return false;
    }

    //contains numbers?
    public static boolean checkNumbers(String pwEntered) {
        boolean isNumber=false;
        int numbersCount = 0;
        for (int i = 0; i < pwEntered.length(); i++) {
            char charac = pwEntered.charAt(i);
            if (Character.isDigit(charac)) {
                isNumber = true;
                numbersCount++;
                countNumbers(numbersCount);
            } else isNumber = false;
        }
        return isNumber;
    }
    //countNumbers
    public static boolean countNumbers(int numbersCount){
        boolean twoOrMoreNums = false;
        if (numbersCount>=2){
            twoOrMoreNums=true;
        }
        displayMissingNums(twoOrMoreNums);
        return twoOrMoreNums;
    }
    //contains Uppercase?
    public static boolean checkUpperCase(String pwEntered) {
        boolean isUpperCase=false;
        int upperCaseCount = 0;
        for (int i = 0; i < pwEntered.length(); i++) {
            char charac = pwEntered.charAt(i);
            if (Character.isUpperCase(charac)) {
                isUpperCase = true;
                upperCaseCount++;
                countUpperCase(upperCaseCount);
            }
        }
        return isUpperCase;
    }
    // count upperCase
    public static boolean countUpperCase (int upperCaseCount){
        boolean twoOrMoreUpper = false;
        if (upperCaseCount>=2){
            twoOrMoreUpper = true;
        }
        displayMissingUpper(twoOrMoreUpper);
        return twoOrMoreUpper;
    }
    public static boolean checkBadPW(String pwEntered, String userName, String userBirthday) {
        if (pwEntered.contains("1234") ||
                pwEntered.contains("4567") ||
                pwEntered.contains("7890") ||
                pwEntered.equals(userName) ||
                pwEntered.equals(userBirthday)
        ) {
            return true;
        } else return false;
    }
    // display if less than 2 nums
    public static void displayMissingNums(boolean twoOrMoreNums){
        if (!twoOrMoreNums){
            System.out.println("2 oder mehr Zahlen benötigt");
        }
        else System.out.println("Genug Zahlen");
    }
    // display if less than 2 Capitals
    public static void displayMissingUpper(boolean twoOrMoreUpper){
        if (!twoOrMoreUpper){
            System.out.println("2 oder mehr Großbuchstaben benötigt");
        }
        else System.out.println("Genug Großbuchstaben");
    }
}

