void main(){
    int atual = 1;
    int proximo = 0;
    int anterior = 0; 
    for(int i = 0; i<=15; i++)
    {
        IO.println(atual);
        proximo = atual+ anterior; 
        anterior = atual;
        atual = proximo;
    }
}