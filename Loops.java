package projects.Basic;

public class Loops {

    public static void main(String args[]) {
        Loops JavaLoops = new Loops();
        JavaLoops.whileLoop();
        JavaLoops.nestedWhileLoop();
        JavaLoops.doWhileLoop();
        JavaLoops.forLoop();
    }

    public void whileLoop() {
        System.out.println("======WHILE LOOP=======");
        int i = 0;
        while (i <= 4) {
            System.out.println("While Loop i : " + i);
            i++;
        }
        System.out.println("*****------------End of while loop----------------******");
    }

    public void nestedWhileLoop() {
        System.out.println("======NESTED WHILE LOOP=======");
        int i = 0;
        while (i <= 4) {
            int j = 0;
            System.out.println("First Iterative variable  : " + i);
            while (j <= 3) {
                System.out.println("Secondary Iterative variable Said Hai j : " + j);
                j++;
            }
            i++;
        }
        System.out.println("*****----------End of Nested while loop-----------------******");
    }

    public void forLoop(){
        System.out.println("============--------FOR LOOP-----==============");
        for(int i=0;i<=5;i++){
            System.out.println("For loop with i :"+i);
        }
    }

    public void doWhileLoop (){
        int i=6;
        System.out.println("========= DO WHILE ========");
        System.out.println("========= Where i "+i);

        do{
            System.out.println("Here is do while i :"+i);
        } while(i<=4);

        System.out.println("=========****** END OF DO WHILE *******========");

    }
}
