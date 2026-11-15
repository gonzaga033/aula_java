void main(){
    int num1= Integer.parseInt(IO.readln("Informe o primeiro numero: "));
    int num2= Integer.parseInt(IO.readln("Informe o segundo numero: "));
    int result = 0 ; 
    if(num1>num2){
        result = num1- num2;
        IO.println(result);
    }
    else{
        result = num2 -  num1;
        IO.println("O resultado da diferenca: " + result);
    }
    
    }
