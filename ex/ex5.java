package ex;

public class ex5 {
    void main (){
         float valor = Float.parseFloat(IO.readln("Informe o valor: "));
         float taxa = Float.parseFloat(IO.readln("Informe da taxa: "));
         float tempo = Float.parseFloat(IO.readln("Informe o tempo: "));
         float prestacao = valor + ((valor*taxa/100) * tempo );
         IO.println(prestacao);
    }
}
