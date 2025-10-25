package inheritancee;

public class Student extends Teachers{


    public void numberget()
    {

        System.out.println("student is getting number");
    }

    public void teach()
    {

        System.out.println("Teacher is teaching english");
    }




    public static void main(String[] args) {

//        Student s1=new Student();
//        s1.teach();

        Teachers tt=new Student();

tt.teach();







    }

}
