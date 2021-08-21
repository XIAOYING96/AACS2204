
package P4Q2;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("D001","Kris Wu");
        s1.addQuiz(2);
        
        Student s2 = new Student("D002","June Lim");
        s2.addQuiz(10);
       
       System.out.println("Student ID > "+s1.getStudentId() + "\n" + "Student Name > "
                + s1.getName() + "\n" + "Number of Quizz > " + s1.getQuizNumber() + "\n" + 
                "Score > " + s1.getScore() + "\n" + "Average > " + s1.getAverageScore());
        
         System.out.println("Student ID > "+ s2.getStudentId() + "\n" + "Student Name > "
                + s2.getName() + "\n" + "Number of Quizz > " + s2.getQuizNumber() + "\n" + 
                "Score > " + s2.getScore() + "\n" + "Average > " + s2.getAverageScore());
    }
    
}
