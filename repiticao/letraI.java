void main(){
    int valor, soma=0;
    for(int i =1 ; i<=10; i++)
    {
        valor= Integer.parseInt(IO.readln("insira um numero: "));
        soma = soma+valor;
    }
    float media = soma/10;
    IO.println("Somatorio: " + soma+ "\nMedia: " + media);
}