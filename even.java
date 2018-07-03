
import java.util.*;



class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int r;
		Scanner c = new Scanner(System.in);
System.out.print("Enter number  ");

r = c.nextInt();
if(r==0 || r>10000){
System.out.print("invalid value ");
	
}
else if (r%2==0){
System.out.print("Even");
	
}

else		{
System.out.print("odd");}
		
	
	}
}