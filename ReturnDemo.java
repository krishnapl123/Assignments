  class ReturnDemo
{ 

 static int SquareRoot(int number)
{  
 int Square=number*number;
  return Square;
 
}

static void findcube(int num)
{
int cube=num*num*num;
System.out.println("cube:" + cube);
}




public static void main(String args[])
{
 int Square=SquareRoot(5);
System.out.println("Square:"  + Square);
findcube(5);

}
}
