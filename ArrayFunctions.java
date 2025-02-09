package projects.Basic;

public class ArrayFunctions {

    public static void main(String args[]) {
        ArrayFunctions arrayFun = new ArrayFunctions();
        arrayFun.basicArrayMethod();
        arrayFun.multiDimensionalArray();
        arrayFun.arrayOfObject();
        arrayFun.enhancedForLoop();
    }

    public void basicArrayMethod() {
        System.out.println("---Array function---");
        System.out.println("Basic array initialisation & Print");
        int numbers[] = { 3, 7, 2, 4 }; // initializing an array
        System.out.println("First element : " + numbers[0]);
        System.out.println("Initialisation of new array with 4 elements");
        int num[] = new int[4];
        System.out.printf("Array NUM of length ", +num.length);
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.printf((i + 1) + "th Element is : " + num[i]);
            System.out.println("||");
        }
    }

    // Multi dimensional array
    public void multiDimensionalArray() {
        System.out.println("-------------||------------");
        System.out.println("-Muti dimensional array-");
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Multi Dimensional array with for-each
    public void forEachMultiArray() {
        int nums[][] = new int[3][];

        for (int number[] : nums) {
            for (int m : number) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public void arrayOfObject(){
        Student s0 = new Student();
        s0.mark = 12;
        s0.name ="Ash";
        s0.rollNo = 3;
        Student s1 = new Student();
        s1.mark = 99;
        s1.name ="Lola";
        s1.rollNo = 4;
        Student s2 = new Student();
        s2.mark = 82;
        s2.name ="Shake";
        s2.rollNo = 1;
        Student s3 = new Student();
        s3.mark = 90;
        s3.name ="Rocky";
        s3.rollNo = 2;

        Student studentList[] = new Student[4];
        studentList[0] =s0;
        studentList[1] =s1;
        studentList[2] =s2;
        studentList[3] =s3;

    //    for(int i=0;i<=studentList.length-1;i++){
    //     System.out.println(studentList[i].name+" : "+studentList[i].mark);
    //    }
       for(Student s: studentList){
        System.out.println("Student "+s.name+" : "+s.mark);
       }
    }

    public void enhancedForLoop(){
        int nums[] = new int[4];
        int i=0;
        nums[0] = (int)(Math.random()*10);
        nums[1] = (int)(Math.random()*10);
        nums[2] = (int)(Math.random()*10);
        nums[3] = (int)(Math.random()*10);
        for(int n : nums){
            System.out.println("Index "+i+" : "+n);
            i++;
        }
   }
}

class Student{
    int rollNo;
    String name;
    int mark;
}