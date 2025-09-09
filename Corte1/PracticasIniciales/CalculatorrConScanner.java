package scannerr;
import java.util.Scanner;

public class Calculatorr {
    public int add(int a, int b){
        return a + b;
    }
    public int restar(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        return a / b;
    }
    public int module(int a, int b) {
        return a % b;
    }
    
    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);
        
        System.out.println("Ingrese un numero ");
        int a = digito.nextInt();
        
        System.out.println("Ingrese el segundo numero ");
        int b = digito.nextInt();
        
        Calculatorr myCalculatorr = new Calculatorr();
        System.out.println(myCalculatorr.add(a, b));
        System.out.println(myCalculatorr.restar(a, b));
        System.out.println(myCalculatorr.multiplicar(a, b));
        System.out.println(myCalculatorr.dividir(a, b));
        System.out.println(myCalculatorr.module(a, b));
        
    }
    
}
