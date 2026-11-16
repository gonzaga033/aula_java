void main(){
    int base = 3;
    double result = 0;
    for(int i=0; i<=15; i++)
    {
        result= Math.pow(base, i);
        IO.println(base + "^" + i + "="+ result);
    }
}