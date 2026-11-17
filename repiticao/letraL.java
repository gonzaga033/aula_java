void main(){
    int valor = Integer.parseInt(IO.readln("informe um valor: "));

    if(valor>=0)
        {
            int maior= valor;
            int menor= valor;

            while(valor>=0)
            {
                valor = Integer.parseInt(IO.readln("informe um valor: "));
                if(valor>=0)
                {
                    if(valor>=maior)
                        maior = valor;
                    if(valor<=menor)
                        menor=valor;
                }
                
            }
            IO.println("maior valor digitado: "+ maior);
            IO.println("menor valor digitado: "+ menor);
        }
        else{
            IO.println("voce nao digitou nenhum valor!");
        }
}
