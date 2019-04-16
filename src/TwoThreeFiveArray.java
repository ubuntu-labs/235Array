public class TwoThreeFiveArray {

    static int divisibleByTwo(int[] array) {

        int divisbleNumbers = 0;

        for (int x : array) {

            if(x % 2 == 0) {
                divisbleNumbers += 1;
            }
        }

        //System.out.println("N-2: " + divisbleNumbers);
        return divisbleNumbers;
    }

    static int divisibleByThree(int[] array) {

        int divisbleNumbers = 0;

        for (int x : array) {

            if(x % 3 == 0) {
                divisbleNumbers += 1;
            }
        }

        //System.out.println("N-3: " + divisbleNumbers);
        return divisbleNumbers;
    }

    static int divisibleByFive(int[] array) {

        int divisbleNumbers = 0;

        for (int x : array) {

            if(x % 5 == 0) {
                divisbleNumbers += 1;
            }
        }

        //System.out.println("N-5: " + divisbleNumbers);
        return divisbleNumbers;
    }

    static int notDivisibleByTwoThreeFive(int[] array) {

        int nonDivisbleNumbers = 0;

        for (int x : array) {

            if(x % 5 != 0 && x % 3 != 0 && x % 2 != 0) {
                nonDivisbleNumbers += 1;
            }
        }

        return nonDivisbleNumbers;
    }

    static int is123Array(int[] array) {

        int numbersDivisibleByTwo = divisibleByTwo(array);
        int numbersDivisibleByThree = divisibleByThree(array);
        int numbersDivisibleByFive = divisibleByFive(array);

        int numberOfTwoThreeFiveDivisibles = numbersDivisibleByFive + numbersDivisibleByThree + numbersDivisibleByTwo;
        int lengthOfArray = array.length;
        int numberOfNonDivisibles = notDivisibleByTwoThreeFive(array);

        //System.out.println("N-None: " + numberOfNonDivisibles);

        int _235PlusNonDivisibles = numberOfTwoThreeFiveDivisibles + numberOfNonDivisibles;

        if(_235PlusNonDivisibles == lengthOfArray) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int[] userArray = {2, 3, 6, 7, 11};

        if(is123Array(userArray) == 1) {
            System.out.println("Array is a 235 Array");
        } else {
            System.out.println("Array is not a 235 Array");
        }

    }
}
