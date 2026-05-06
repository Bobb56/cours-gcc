int opti1(int a, int b, int c) {
    int d = 42;
    for(int i = 0; i < 7; i=i+1) {
        if(i > b){
            d = b + c;
        }
    }
    int e = d+1;
    return c;
}