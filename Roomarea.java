class Room
{
float length,breadth;
void getdata(float a,float b)
{
length=a;
breadth=b;
}
void display()
{
float res;
res=(length*breadth);
System.out.println("the Room area="+res);
}
}
class Roomarea
{
public static void main(String args[])
{
Room r=new Room();      //creating object statement
r.getdata(5,10);           //calling member  function
r.display();
}
}
 