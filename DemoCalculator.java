package projects.Basic;

public class DemoCalculator {
    public static void main(String args[]){
        Calculator Calc = new Calculator();
        int res = Calc.add(4,3);
        int res1 = Calc.add(4,3,2);
        int res2 = Calc.add(4);
        System.out.println("Sum of 4 + 3 : "+res);
        System.out.println("Sum of 4 + 3 +2 : "+res1);
        System.out.println("Sum of 4 + 1: "+res2);

    }
}

class Calculator {
    public int add(int a,int b){
     return a + b; 
    }
    
    //Method overloading 
    public int add (int a, int b, int c){
        return a + b + c;
    }

    // Method overloading 
    public int add (int a){
        return a + a;
    }
}