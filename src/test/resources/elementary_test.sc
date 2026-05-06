int f(int n) {
    int a = 2;
    int b = 1;
    int c = 1;
    if (n < 1) {
        return a;
    }
    else {
        if (n < 3) {
            return b + c;
        }
        else {
            return a + b + c + n;
        }
    }
}