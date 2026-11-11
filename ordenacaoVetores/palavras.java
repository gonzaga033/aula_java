void main(){

    var palavra = new String[5];
    String aux;

    
    for(int cont = 0; cont < palavra.length; cont++){
        palavra[cont] = IO.readln("Digite PALAVRA[" + cont + "]: ");
    }

    
    IO.println("Estas foram as palavras digitadas:");

    for(int cont = 0; cont < palavra.length; cont++){
        IO.println("PALAVRA[" + cont + "]: " + palavra[cont]);
    }

    
    for(int i = 0; i < palavra.length - 1; i++){
        for(int j = i + 1; j < palavra.length; j++){

            if(palavra[i].compareTo(palavra[j]) > 0){
                aux = palavra[i];
                palavra[i] = palavra[j];
                palavra[j] = aux;
            }
        }
    }

    
    IO.println("Estas foram as palavras ordenadas:");

    for(int cont = 0; cont < palavra.length; cont++){
        IO.println("PALAVRA[" + cont + "]: " + palavra[cont]);
    }

}