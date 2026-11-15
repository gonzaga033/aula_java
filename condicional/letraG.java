void main(){
    int a = Integer.parseInt(IO.readln("insira o valor para a: "));
    int b = Integer.parseInt(IO.readln("insira o valor para b: "));
    int c = Integer.parseInt(IO.readln("insira o valor para c: "));
    int d = Integer.parseInt(IO.readln("insira o valor para c: "));

    if((a%3==0) && (a%2==0))
    {
        IO.println(a + " esse numero e divisivel por 2 e 3 ");
    }
    if((b%3==0) && (b%2==0))
    {
        IO.println(b + " esse numero e divisivel por 2 e 3 ");
    }
    if((c%3==0) && (c%2==0))
    {
        IO.println(c + " esse numero e divisivel por 2 e 3 ");
    }
    if((d%3==0) && (d%2==0))
    {
        IO.println(d + " esse numero e divisivel por 2 e 3 ");
    }
}
