void main (){
    int a = Integer.parseInt(IO.readln("insira o valor para a: "));
    int b = Integer.parseInt(IO.readln("insira o valor para b: "));
    int c = Integer.parseInt(IO.readln("insira o valor para c: "));
    int aux; 
    if(a>b)
    {
        aux = a;
        a = b;
        b = aux;
    }
    if(a>c)
    {
        aux = a;
        a = c;
        c = aux; 
    }
    if(b>c)
    {
        aux = b;
        b = c;
        c = aux;
    }
    IO.println("aqui estao os valores ordenados: \n" + a + "-"+ b + "-"+ c);
}