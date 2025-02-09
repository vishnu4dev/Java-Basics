package projects.Basic;

public class ConditionChecks {

    static int x = 7;
    static int y = 12;
    int res;

    public static void main(String a[]) {
        ConditionChecks checker = new ConditionChecks();
        checker.checkIfElse();
        checker.checkTernaryOperator();
        checker.switchStatement();
    }
    
    // Switch Case
    public void switchStatement(){
        System.out.println("==============Switch Case===============");
        System.out.println("Print the day with value of x");
        String result ="";

        result = switch (x) {
            case 1 : yield "monday";
            case 7 : yield "sunday";
            default : yield "holiday";
        };
        System.out.println("Today is "+result);
    }

    // Ternary Operator 
    public void checkTernaryOperator() {
        System.out.println("=======Ternary Operator=========");
        res = x % 2 == 0 ? 0 : 1;
        if (x > 0)
            System.out.println("Odd number");
        else
            System.out.println("Even number");
    }

    //Check if else
    public void checkIfElse() {
        if (x > y)
            res = x;
        else
            res = y;
        System.out.println(res + " is the biggest number");
    }
}
