package week1;

public class Main{
    public static void main(String[] args) {
        Alcohol alcohol = new Alcohol();
        // use dot notation to access object's property
        alcohol.value = "Cheap";
        alcohol.appearance = "White";

        alcohol.print();

        Alcohol alcohol1 = new Alcohol();
        alcohol1.value = "Expensive";
        alcohol1.appearance = "Brown";
        
        System.out.println();
        alcohol1.print(); 
    }
}