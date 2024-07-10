import java.util.*;

public class Main {



  public static void main(String[] args) {

    Student s1 = new Student(9, "John");
    Student s2 = new Student(4, "Mary");
    Student s3 = new Student(1, "Bob");
    Student s4 = new Student(7, "Alice");

    List<Student> stds = new ArrayList<>();
    stds.add(s1);
    stds.add(s2);
    stds.add(s3);
    stds.add(s4);

    System.out.println(stds);
    System.out.println();
    Collections.sort(stds, new Comparator<Student>(){
      public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
      }
    });
    System.out.println(stds);

    
    

  }
}