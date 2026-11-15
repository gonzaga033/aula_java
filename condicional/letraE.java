void main(){
    double a =Double.parseDouble(IO.readln("insira o valor para A: "));
    double b =Double.parseDouble(IO.readln("insira o valor para B: "));
    double c =Double.parseDouble(IO.readln("insira o valor para C: "));

    if(a == 0)
        IO.println("insira outro valor para A");
    else {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if(delta < 0)
            IO.println("delta negativo, insira outros valores");
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            IO.println("primeira raiz: " + x1 + "\n" + "segunda raiz: " + x2);
        }
    }
}