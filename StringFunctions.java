package projects.Basic;

public class StringFunctions {
    
    public static void main(String args[]){
        StringFunctions s = new StringFunctions();
        s.stringConcatination();
    }

    public void stringConcatination() {
        String name = "vishnu";
        System.out.println(name.concat(" kumar"));
    }

    public void stringBufferFun() {
        StringBuffer name = new StringBuffer("Vishnu");
        System.out.println(name.append(" kumar"));
    }
}
