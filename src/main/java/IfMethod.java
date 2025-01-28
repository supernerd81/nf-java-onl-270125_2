public class IfMethod {
int age = 3489;
    public static void main(String[] args) {

        int zahl1 = 22;
        int zahl2 = 88;

        int ergebnis = add(zahl1, zahl2);
        System.out.println(ergebnis);

        zahl1 = 55;
        zahl2 = 45;

        if(zahl1 > zahl2) {
            System.out.println(substract(zahl1, zahl2));
        } else {
            System.out.println(add(zahl1, zahl2));
        }

        System.out.println(checkNumber(44));

        System.out.println(palindrome("ddffssffd"));

        System.out.println(makePositive(30));

    }

    public static int add(int zahl1, int zahl2) {

        return zahl1+zahl2;
    }

    public static double add(double zahl1, double zahl2) {
        return zahl1+zahl2;
    }

    public static int substract(int zahl1, int zahl2) {
            return zahl1 - zahl2;
    }

    public static int makePositive(int zahl) {
        if(zahl < 0) {
            return zahl*-1;
        }
        else {
            return zahl;
        }
    }

    public static int checkNumber(int zahl) {

        if(zahl % 2 == 0) {
            return zahl;
        } else {
            return zahl * 2;
        }

    }

    public static boolean palindrome(String string) {

        int stringLength = string.length();
        int test;

        StringBuilder newString = new StringBuilder(string).reverse();
        if(newString.toString().equals(string)) {
            return true;
        }

        return false;


        //StringBuilder newString = new StringBuilder();

/*        for(int i = stringLength; i > 0; i--) {
            newString.append(string.charAt(i-1));
        }*/
        //return string.contentEquals(newString);


    }

}