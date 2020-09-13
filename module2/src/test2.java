class Student extends Person{
    public String university;
    public Student(String name, int age, float height, String university){
        super(name,age,height);
        this.university = university;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("University Name: " + this.university);
    }
}
