package ch02;
import java.util.*;
public class Calculation2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner tj = new Scanner (System.in);
		System.out.println("请输入第一个整数:");
		int a = tj.nextInt();
		System.out.println("请输入第二个整数:");
		int b = tj.nextInt();
		System.out.println("请输入第三个整数:");
		int c = tj.nextInt();
		System.out.println("三个数之和：" + ( a + b + c ) );
		System.out.println("三个数的平均值：" + ( a + b + c ) / 3 );	
		int max = a>b?a:b;
		max = max>c?max:c;
		int min = a<b?a:b;
		min = min<c?min:c;
		System.out.println("三个数中的最大值："+max);
		System.out.println("三个数中的最小值："+min);
		
		
		
		
		
	}
}
