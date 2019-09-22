// Program that finds all "twin primes" between 0 and 100
// Twim primes being primes with a difference of 2.

class findTwinPrimes {

    public static void main(String[] args) {
        // Print the twin primes between 0 and 100
        int int1 = 3;
        while(int1 <= 100) {
            if (isPrime(int1)) {
                int int2 = int1 + 2;
                // If both are prime, print a message
                if (isPrime(int2)) {
                    System.out.println("(" + int1 + ", " + int2 + ")");
                }
            }
            int1 = int1 + 1;
        }
    }

    public static boolean isPrime(int integer) {
        // Determine if a given integer is a prime number
        boolean prime = true;

        int counter = 2;
        while (counter < integer) {
            if (integer % counter == 0) {
                prime = false;
            }
            counter = counter + 1;
        }

        return prime;
    }

}
