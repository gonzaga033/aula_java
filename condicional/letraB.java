void main(){
    int num = Integer.parseInt(IO.readln("informe o numero: "));

    if(num<0){
        int result = num * (-1);
        IO.println("o modulo do numero e: "+ result); 
    }
    else{
        IO.println("o modulo do numero e: "+ num); 
    }

}