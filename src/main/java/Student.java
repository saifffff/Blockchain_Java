public class Student implements Comparable<Student> {

  private int id;
  private String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  @Override
  public String toString() {

    return "Student [id=" + id + ", name=" + name + "]"+"\n";
  }

  public int compareTo(Student o) {
    Student s = (Student) o;

    return this.id - s.id;
  }
}
