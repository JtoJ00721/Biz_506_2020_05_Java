package com.biz.hello;

public class Var_02 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 0;
		
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		
		System.out.println("====================================");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("===================================="); 
		
		//num2값에 뭐가할당되어있던 생까고 0으로 clear
		// 처음 시작지점으로 회귀
		num2= 0;//재설정, clear
		
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		System.out.printf("%d x %d = %d",num1,num2,(num1*num2++));
		System.out.println();
		
		System.out.println("====================================");
		num2=0;
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("%d x %d = %d\n",num1,num2,(num1*num2++));
		System.out.printf("\n");
		
	}
}
