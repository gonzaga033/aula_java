package ex;

public class ex3 {
    void main(){
        float raio = Float.parseFloat(IO.readln("Informe o raio da lata: "));
        float altura = Float.parseFloat(IO.readln("Informe a altura da lata: "));
        double volume = 3.14 * Math.pow(raio, 2) * altura;
        IO.println("O volume da lata é:  " + volume + "cm3");
    }
}
