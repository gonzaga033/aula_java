
void main(){
    String continua = "S", comodo;
    float largura, comprimento, areaTotal = 0;

    while (continua.equalsIgnoreCase("S")) {
        comodo = IO.readln("informe o nome do comodo: ");
        largura = Float.parseFloat(IO.readln("informe o largura do " + comodo));
        comprimento = Float.parseFloat(IO.readln("informe o comprimento do " + comodo));
        areaTotal = areaTotal + largura*comprimento;
        continua = IO.readln("deseja continuar (S/N): ");
    }
    IO.println("a area total da residencia e: "  + areaTotal);
}