void main(){
    String nome = IO.readln("insira seu nome: ");
    String sexo = IO.readln("insira seu sexo (f/m): ");

    switch (sexo.toUpperCase()) {
        case "M":
            IO.println("Ilmo senhor " + nome);
            break;
        case "F":
            IO.println("Ilma senhora " + nome);
            break;
        default:
            break;
    }
}