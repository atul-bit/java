// 1. ways to create array
// 2. create multi dimensional array
// 3. create array of object
// 4. enhanced for loop (for each loop)

class Student {
    String name;
    int rollNo;
    int marks;
}

public class Arrays {
    public static void main (String[] args) {
        // ways to create array
        int nums[] = {1,2,3,4};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " : " + nums[i]);
        }

        int nums2[] = new int[5];
        // update array with random value
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(i + " nums2 : " + nums2[i]);
        }

        //enhanced for loop
        for (int num : nums2) {
            System.out.println("for each loop : " + num);
        }

        //multi-dimensional arrray
        // int multidimensionalArray[][] = new int[row][col]
        int multiArray[][] = new int[3][4];
        for(int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop in for multi dimensional array
        System.out.println("Enhanced for loop over multi dimenasional array");
        for (int n[] : multiArray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //creating array of object
        Student s1 = new Student();
        s1.name = "atul";
        s1.rollNo = 1;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "yogi";
        s2.rollNo = 2;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "abhi";
        s3.rollNo = 3;
        s3.marks = 89;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("Looping over array of object");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " marks is " + students[i].marks);
        }

        System.out.println("Looping over array of object using enhanced for loop");
        for (Student stud : students) {
            System.out.println(stud.name + " marks is " + stud.marks);
        }
    }
}