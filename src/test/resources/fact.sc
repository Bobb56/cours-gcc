int factorial(int n) {
    int result = 1;
    while (n > 0) {
        for (int i=0 ; i < n ; i=i+1) {
            for (int j=i ; j < n ; j=j+1) {
                result = result + result;
            }
        }
        n = n - 1;
    }
    return result;
}