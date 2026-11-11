
void main(){

    var num = new int[5];
    int aux;

    // Entrada dos números
    for(int cont = 0; cont < num.length; cont++){
        num[cont] = Integer.parseInt(
            IO.readln("Digite NUM[" + cont + "]: ")
        );
    }

    // Exibição dos números digitados
    IO.println("Estes foram os numeros digitados:");

    for(int cont = 0; cont < num.length; cont++){
        IO.println("NUM[" + cont + "]: " + num[cont]);
    }

    // Ordenação dos números
    for(int i = 0; i < num.length - 1; i++){
        for(int j = i + 1; j < num.length; j++){

            if(num[i] > num[j]){
                aux = num[i];
                num[i] = num[j];
                num[j] = aux;
            }
        }
    }

    // Exibição dos números ordenados
    IO.println("Estes foram os numeros ordenados:");

    for(int cont = 0; cont < num.length; cont++){
        IO.println("NUM[" + cont + "]: " + num[cont]);
    }
}
