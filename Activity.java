public class Activity {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student student1 = new Student();
        
         // Setting the student ID and name using the setter methods
         student1.setStudentId(2319658);
         student1.setName("Nik");
 
         // Printing the student ID and name using the getter methods
         System.out.println("Student ID: " + student1.getStudentId());
         System.out.println("Name: " + student1.getName());
 
         // Practical Exercise: Creating an instance of Book
         Book book1 = new Book();
         
         // Setting the book attributes using the setter methods
         book1.setBookNumber(101);
         book1.setTitle("Diary of a Wimpy Kid");
         book1.setAuthor("Jeff Kinney");
         book1.setPrice(459.99);
 
         // Printing the book details using the getter methods
         System.out.println("\nBook Details:");
         System.out.println("Book Number: " + book1.getBookNumber());
         System.out.println("Title: " + book1.getTitle());
         System.out.println("Author: " + book1.getAuthor());
         System.out.println("Price: " + book1.getPrice());
    }
}