//Write a java program to encrypt a grade by 8 to it. Decrypt it to show the correct grade.

public class Problem_1 {
    public static void main(String[] args) {
        char grade= 'B';
        grade = (char)(grade+8);//code encryption
        System.out.println(grade);

        grade = (char)(grade-8);//code decryption
        System.out.println(grade);

    }
}

