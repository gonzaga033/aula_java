    void main(){
        var num = new int[5];

        for(int cont=0;cont<5;cont++){
            num[cont] = Integer.parseInt(IO.readln("digite o " + (cont+1) + " o numero : "));

            IO.println("Estes foram os numeros digitados: ");
            
            for(int cont1=0;cont1<5;cont1++)
                IO.println("Posição " + (cont1) + " numero: " + num[cont1]);
            }
        }
    
