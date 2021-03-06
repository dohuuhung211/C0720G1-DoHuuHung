package thi_thu;


public class Student implements Comparable<Student>{
    int id;
    String name;
    String birthday;

    public Student(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date of birth=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int result = this.getName().compareTo(student.getName());
        if (result == 0){
            result = this.getId() - student.getId();
        }
        return result;
    }
}
