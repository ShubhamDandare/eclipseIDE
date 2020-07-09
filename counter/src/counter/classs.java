package counter;



public class classs {
int rollno;
String name;
static String college="p.i.e.t";
classs(int r,String n)
{
rollno =r;
name =n;}
void disply()
{System.out.println(rollno+" "+name+" "+college);}
	public static void main(String[] args) {
	classs c1 =new classs(33,"raju");
	classs c2 =new classs(44,"bala");
	c1.disply();
	c2.disply();
}

}
