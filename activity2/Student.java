public class Student{
        int studentId;
        String firstName, middleName, lastName, gender, email;
        static int totalStudents = 0;

        public Student(){}
        public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
            this.studentId = studentId;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.gender = gender;
            this.email = email;
        }

        public void displayStudentInfo(){
            System.out.println("\nStudent Info");
            System.out.println("Student ID - " + this.studentId);
            System.out.println("FirstName - " + this.firstName);
            System.out.println("MiddleName - " + this.middleName);
            System.out.println("LastName - " + this.lastName);
            System.out.println("Gender - " + this.gender);
            System.out.println("Email - " + this.email);
        }

        public static int getTotalStudents(){
          return totalStudents;
        }



        
    }