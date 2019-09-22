def isPrime(int):
    prime = True
    for num in range(2, int - 1):
        if int % num == 0:
            prime = False
    return prime

for int in range(3, 100):
    if isPrime(int):
        int2 = int + 2
        if isPrime(int2):
            print(f"({int}, {int2})")
