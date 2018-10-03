interface sturoll
{
 void rollno();
}
interface stuname extends sturoll
{
 void name();
}
interface stubranch extends sturoll
{
 void branch();
}
class STUDENT implements stuname
{
 public void rollno()
{
 System.out.println("72");
}
public void name()
{
 System.out.println("KISHOR");
}
public void branch()
{
 System.out.println("CSE");
}
public static void main(String[] args)
{
 STUDENT s=new STUDENT();
 System.out.println("rollno");
 s.rollno();
 System.out.println("name");
 s.name();
 System.out.println("branch");
 s.branch();
}
}
 

