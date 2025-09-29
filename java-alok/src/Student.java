import java.util.Objects;

public class Student {
    int rollno;
    String name;
    String gender;

    public Student() {

    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Student(String name, int rollno, String gender) {
        this.name = name;
        this.rollno = rollno;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

   @Override
    public int hashCode() {

        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
