package ex;

public class ex4 {
    void main(){
        float tempo = Float.parseFloat(IO.readln("Informe o tempo gasto na viagem: "));
        float velocidade = Float.parseFloat(IO.readln("Informe a velocidade: "));
        float distancia = tempo * velocidade; 
        float litrosUsados = distancia/12; 
        IO.println("A velocidade media : " + velocidade + " Tempo gasto: " + tempo + " distancia percorrida : " + distancia + " quantidade de listros: " + litrosUsados);

    }
}
