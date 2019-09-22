class findTwinPrimes {

    public static void main(String[] args) {
        int int1 = 3;
        while(int1 <= 100) {
            if (isPrime(int1)) {
                int int2 = int1 + 2;
                if (isPrime(int2)) {
                    System.out.println("(" + int1 + ", " + int2 + ")");
                }
            }
            int1 = int1 + 1;
        }
    }

    public static boolean isPrime(int integer) {
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
