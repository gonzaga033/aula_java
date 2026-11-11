void main(){
    int num = Integer.parseInt(IO.readln("Informe um numero: "));
    int mult = 1;

    do{
         System.out.printf("%d x %d = %d \n", num, mult, num*mult);
        mult++;
    }
    while (mult<=10);
}
