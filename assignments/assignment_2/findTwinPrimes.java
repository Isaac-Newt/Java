class Main {

  public static void main(String[] args) {

    int int1 = 1;
    while(int1 <= 100) {

      if (int1 <= 2) {
        if (isPrime(int1)) {
          int int2 = int1 + 1;
          if (isPrime(int1 + 1)) {
            System.out.println("(" + int1 + ", " + int2 + ")");
          }
        }
      }

      else {
        if (isPrime(int1)) {
          int int2 = int1 + 1;
          if (isPrime(int1 + 2)) {
            System.out.println("(" + int1 + ", " + int2 + ")");
          }
        }
      }

      int1 = int1 + 1;

    }

  }

  public static boolean isPrime(int integer) {
    System.out.println(integer);
    boolean prime = false;

    if (integer <= 2) {
      prime = true;
    }

    else {
      if (integer % 2 == 0) {
        prime = false;
      }

      else {
        int counter = integer;
        boolean divisible = false;
        while (counter > 0 && divisible == false) {
          if (integer % counter == 0) {
            divisible = true;
          }
          counter = counter - 2;
        }

        if (divisible == false) {
          prime = true;
        }
      }
    }

    return prime;
  }

}
