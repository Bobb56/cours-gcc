int alu(int op, int a, int b){
    if (op > 1){
        if (op > 0){
            return a-b;
        }
        else {
            return a*b;
        }
    }
    else {
        return a+b;
    }
}