package jlfjljflf;

public class Ilsemlerrr implements Runnable{
		String name;
	public Ilsemlerrr(String name) {
			this.name=name;
		}
	@Override
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println(this.name+": "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println("hataaa");
		}
	}
}
