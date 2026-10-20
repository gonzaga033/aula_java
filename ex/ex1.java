package ex;
public class ex1 {
    public static void main(String[] args) {
        float tempC, fah;
        tempC = Float.parseFloat(IO.readln("Informe a temperatura em Celsius: "));
        fah = (tempC * 9 + 160) / 5;
        IO.print("A conversão da temperatura é: " + fah + " Fahrenheit");
    }
}