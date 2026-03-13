package com.alvas;

public class App {
	public static int fact(int n)
	{
		if (n==1)
			 return 1;
		else
			return (fact(n-1)*n);
	}

    public static void main(String[] args) {

        App sc = new App();
        int res=sc.fact(3);

        System.out.print("the result"+res);
       
    }
}

