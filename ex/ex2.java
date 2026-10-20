package ex;

public class ex2 {
     public static void main(String[] args) {
       
        float fah = Float.parseFloat(IO.readln("Informe a temperatura em Fahrenheit: "));
        float tempC = (fah - 32) * ((float)5/9);
        IO.print("A conversão da temperatura é: " + tempC + " Celsius");
    }
}
