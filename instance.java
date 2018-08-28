class human
{
 public void display()
  {
   System.out.println("Inside human class");
  }
}
class student extends human
{
 public student()
  {
    super.display();
  }
}
class instance
{
public static void main(String[] args)
{
 student obj=new student();
}
}