
package P4Q2;

public class Student {
    private String studentId;
    private String name;
    private static double quizScore;
    private double quizNumber;
    
    public Student(String studentId,String name){
        this.studentId = studentId;
        this.name = name;
        quizNumber = 0;
        quizScore = 0;
    } 
    
    public String getStudentId(){
        return studentId;
    }
    
    public String getName(){
        return name;
    }
    
    public double getQuizNumber(){
        return quizNumber;
    }
    
    public void addQuiz(int score){
        quizNumber = score;
        quizScore = 10 * quizNumber;
    }
    
    public static double getScore(){
        return (double)quizScore / 0.2;
    }
    
    public double getAverageScore(){
        return (int)quizScore/quizNumber;
    }
}
