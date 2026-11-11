void main(){
    int num = Integer.parseInt(IO.readln("Informe um numero: "));
    int mult = 1;
    while (mult<=10) {
        System.out.printf("%d x %d = %d \n", num, mult, num*mult);
        mult++; 
    }
}