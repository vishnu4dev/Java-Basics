package projects.Basic;

public class DemoCalculator {
    public static void main(String args[]){
        Calculator Calc = new Calculator();
        int res = Calc.add(4,3);
        System.out.println("Sum of 4 + 3 :"+res);
    }
}

class Calculator {
    public int add(int a,int b){
     return a + b; 
    }
}