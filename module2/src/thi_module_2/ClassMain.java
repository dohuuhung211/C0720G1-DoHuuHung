package thi_module_2;

public class ClassMain {
    private String idClass;
    String name;
    String idTeacher;

    public ClassMain(String idClass, String name, String id) {
        this.idClass = idClass;
        this.name = name;
        this.idTeacher = id;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "Ma lop hoc: " + idClass +
                ", ten lop hoc: " + name + '\'' +
                ", ma giao vien" + idTeacher + '\'' +
                '}';
    }
}
