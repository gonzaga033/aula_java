void main(){
    int soma=0, cont= 0 ;
    for(int i =50 ; i<=70; i++)
    {   
        if(i%2 ==0)
        {
        soma = soma+i;
        cont++;
        }
    }
    float media = soma/cont;
    IO.println("Somatorio: " + soma+ "\nMedia: " + media);
}
