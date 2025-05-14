public class Student {
    int Age;
    String Name,Major;
    public Student(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    public Student(String Name,int Age,String Major){
        this.Name=Name;
        this.Age=Age;
        this.Major=Major;
    }
    public void DisplayStudentInfo(){
        System.out.println("Student's Name is "+this.Name);
        System.out.println("Students Age is "+this.Age);
        System.out.println("Students Major is "+this.Major);
    }
}
