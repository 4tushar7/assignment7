class reck
{
  reck()
  {
   System.out.println("This is reference to current calling object");
  }
  reck(int z)
  {
   this();
  }
}
class call
{
public static void main(String[] args)
{
reck z=new reck(47);
}
}