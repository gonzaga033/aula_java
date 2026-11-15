void main(){
    int num = Integer.parseInt(IO.readln("insira o valor para num: "));
    if (num>=1 && num<=9) {
        IO.println("o valor esta na faixa permitida");
    }
    else
    {
        IO.println("o valor nao esta na faixa permitida");
    }
}