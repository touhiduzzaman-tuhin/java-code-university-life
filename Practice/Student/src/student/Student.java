
package student;


public class Student {

    
    private String id;
    private String name;
    private String sec;
    private String batch;
    
    public Student(){}
    
    public Student(String i, String n, String s, String m)
    {
        this.id = i;
        this.name = n;
        this.sec = s;
        this.batch = m;
    }
    public void display()
    {
        System.out.println(id + name + sec + batch);
    }
    public static void main(String[] args) {
        
        Student s1,s2;
        s1 = new Student("Id: 162-15-7727\n", "Name: Tuhin\n", "Sec: G\n", "Batch: 44\n");
        s2 = new Student("Id: 162-15-0000\n", "Name: Shama\n", "Sec: H\n", "Batch: 44\n");
        
        s1.display();
        s2.display();
    }
    
}
