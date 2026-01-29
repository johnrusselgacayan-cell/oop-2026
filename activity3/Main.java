public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(2510790, "John Russel", "Tan", "Gacayan", "Male", "jr.g@lorma.edu");
        Student s2 = new Student(1234567, "Nathaniel", "Tan", "Gacayan", "Male", "n22@gmail.com");
        Student s3 = new Student(1231231, "Vyne", "Gacayan", "Flores", "Male", "VV@gmail.com");
        
        Course c1 = new Course("CS101", "Introduction to Programming");

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);
        c1.displayCourseInfo();
    }
}
