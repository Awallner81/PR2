package org.campus02.threading04;

public class ThreadConsolePrinter extends Thread {

	private char identifier;
	private boolean isStopped;
	
	public ThreadConsolePrinter(char c)
	{
		identifier = c;
		isStopped = false;
	}
	
	
	
	public void setStopped(boolean isStopped) {
		this.isStopped = isStopped;
	}



	@Override
	public void run()
	{
		int i = 0;
		while(!isStopped)
		{
			i++;
			System.out.println(i + " [ identifier: " + identifier + "]");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
