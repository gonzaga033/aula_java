void main() {
    int num = Integer.parseInt(IO.readln("Informe um numero: "));

    for (int mult = 1; mult <= 10; mult++) {
        System.out.printf("%d x %d = %d \n", num, mult, num * mult);
    }
}