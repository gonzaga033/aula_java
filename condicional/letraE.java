
void main(){
    double a = Double.parseDouble(IO.readln("Insira o valor para A: "));
    double b = Double.parseDouble(IO.readln("Insira o valor para B: "));
    double c = Double.parseDouble(IO.readln("Insira o valor para C: "));

    if(a == 0)
        IO.println("Insira outro valor para A");
    else {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0)
            IO.println("Delta negativo, não existem raízes reais");
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            if(delta == 0)
                IO.println("Raiz única: " + x1);
            else
                IO.println("Primeira raiz: " + x1 + "\nSegunda raiz: " + x2);
        }
    }
}
