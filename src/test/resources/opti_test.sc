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

int opti2() {
    int i = 1;
    int j = 1;
    int k = 0;
    while(k < 100) {
        if(j < 20) {
            j = i;
            k = k+1;
        }
        else {
            j = k;
            k = k+2;
        }
    }
    return j;
}