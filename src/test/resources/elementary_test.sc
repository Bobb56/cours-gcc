int elementary(int a) {
    int b = 1;
    for (int i = 0 ; i < 2 ; i = i + 1) {
        if (b > 1) {
            return 42;
        }

        if (b < 2) {
            b = 2;
        }
    }
}