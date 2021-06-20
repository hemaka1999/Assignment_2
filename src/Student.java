public class Student
{
    int SID, Sub1, Sub2, Sub3;
    String Sname;

    void getStuData(int id, String name)
    {
        SID=id;
        Sname=name;
    }

    void getStuMarks(int sub1, int sub2, int sub3)
    {
        Sub1=sub1;
        Sub2=sub2;
        Sub3=sub3;
    }

    void totalMarks()
    {
        System.out.println(SID + " : " + Sname);
        System.out.println("Total = " + (Sub1+Sub2+Sub3));
        System.out.println();

    }

    public static void main(String[] args)
    {
        Student stu1 = new Student();
        stu1.getStuData(1, "Jhone");
        stu1.getStuMarks(10,10,10);
        stu1.totalMarks();

        Student stu2 = new Student();
        stu2.getStuData(2, "Peter");
        stu2.getStuMarks(14,11,10);
        stu2.totalMarks();


    }

}
