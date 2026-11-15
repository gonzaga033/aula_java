void main(){
    int nt1= Integer.parseInt(IO.readln("Informe a primeira nota: "));
    int nt2= Integer.parseInt(IO.readln("Informe a segunda nota: "));
    int nt3= Integer.parseInt(IO.readln("Informe a terceira nota: "));
    int nt4= Integer.parseInt(IO.readln("Informe a quarta nota: "));
    int media = (nt1+nt2+nt3+nt4)/4; 

    if(media>=5){
        IO.println("Media: "+media + " Aluno aprovado!!");
    }
    else{
        IO.println("Media: "+media + " Aluno reprovado!!");
    }
    }
