void main() {
    int num1 = Integer.parseInt(IO.readln("insira o valor para num1: "));
    int maior = num1;
    int menor = num1;
    int num2 = Integer.parseInt(IO.readln("insira o valor para num2: "));
    if(num2>num1)
    {
        maior = num2;
    }
     if(num2<num1)
    {
        menor = num2;
    }
    int num3 = Integer.parseInt(IO.readln("insira o valor para num3: "));
     if(num3>num1)
    {
        maior = num3;
    }
     if(num3<num1)
    {
        maior = num3;
    }
    int num4 = Integer.parseInt(IO.readln("insira o valor para num4: "));
     if(num4>num1)
    {
        maior = num4;
    } 
    if(num4<num1)
    {
        maior = num4;
    }
    int num5 = Integer.parseInt(IO.readln("insira o valor para num5: "));
     if(num5>num1)
    {
        maior = num5;
    }
     if(num5<num1)
    {
        maior = num5;
    }
    IO.println("o maior numero lido foi: " + maior + "\no menor numero lido foi: " + menor);
}