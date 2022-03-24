public class Main {
    public static void main(String[] args) {
        int triesLeft = 10;
        int triesLeftNew = countTries(triesLeft);
        System.out.println(triesLeftNew);
    }

    public static int countTries(int triesLeft) {
       triesLeft-=triesLeft;
       return triesLeft;
        }
    }

