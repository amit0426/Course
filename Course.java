
import java.util.*;

public class Course {
    
    int courseId;
    String courseName;
    int  courseFee;
    void displayCourseDetails(i,j,l){

        this.courseId =i;
        this.courseName = j;
        this.courseFee = l;


    }

     static  void authenticate(String username, String password){

        if(username == "Admin" && password == "1234")
        {
            Course h = new Course();
        }
        else{
            System.out.println("Invalid Username or password");
        }

    }
    public static void main(String[] args) {

        Course h1 = new Course();
        Scanner d1 = new Scanner(System.in);

        System.out.println("Enter your Course Id :");

        int id = d1.nextInt();

        h1.courseId=id;

        System.out.println("Enter Your Course Name");

        String name = d1.next();

        h1.courseName = name;

        System.out.println("Enter Your CourseFees :");

        int fees = d1.nextInt();

        h1.courseFee = fees;

        System.out.println(h1.displayCourseDetails());
    }
}
