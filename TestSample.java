package org.git.GitProject;

public class TestSample
{
	private void t1()
	{
		System.out.println("1");
	}
	private void t2()
	{
		System.out.println("4");
	}
	private void t3()
	{
		System.out.println("3");
	}
	private void t4()
	{
		System.out.println("3");
	}
	
	public static void main(String[] args)
	{
		TestSample ts = new TestSample();
		ts.t1();
		ts.t2();
		ts.t3();
		ts.t4();
	}

}
