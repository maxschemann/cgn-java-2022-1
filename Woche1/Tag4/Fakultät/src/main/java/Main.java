public class Main {
    public static void main(String[] args) {
        int num = 3;
        faculty(num);
    }

    public static int faculty (int num){
        int i =1;
        int fact = 1;
        while (i<=num){
            fact=fact*i;
            System.out.println(fact);
            i++;
        }
        return fact;
    }
}
