
package P4Q5;

public class Course {
    private String courseTitle;
    private double feePerStudent;
    private int noOfStudents;
    private String[] studentName = new String[100];
    private static int courseCount;
    
    public Course(String courseTitle , double feePerStudent){
        this.courseTitle = courseTitle;
        this.feePerStudent = feePerStudent;
        courseCount++;
    }
    
    public double getFeePerStudent(){
        return feePerStudent;
    }
    
    public double setFeePerStudent(double fees){
        this.feePerStudent = fees;
    }
    public String getCourseTitle(){
        return courseTitle;
    }
    
    public String setCourseTitle(String courseTitle){
        String flag = "fail";
        
            if(courseTitle.length()<=60){
                this.courseTitle = courseTitle;
                return flag = "successful";
            }
            else
                return flag;
        }
    
    public String[] getStudentName(){
        return studentName;
    }
    
    public int getNoOfStudent(){
        return noOfStudents;
    }
    
   public int getCourseCount(){
       return courseCount;
   }
   
   public double calcFeesCollection(){
       return feePerStudent * noOfStudents;
   }
   
   public void addStudent(String studName){
       if(studName != null)
        studentName[noOfStudents] = studName;
        noOfStudents++;
   }
    
    public String toString(){
        return "Course Title >" + courseTitle +"\nFees Per Student > " + feePerStudent 
                + "\nCourse Count >" + courseCount + "\nNo Of Students > " + noOfStudents;
    }
    
}
