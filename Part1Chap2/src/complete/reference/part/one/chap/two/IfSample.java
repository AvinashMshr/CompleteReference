package complete.reference.part.one.chap.two;

public class IfSample {
	
	public static void main(String args[]) {
		int x,y;
		
		x = 10;
		y = 20;
		
		if(x < y) {
			System.out.println("X is less than y");
		}
		
		x = x*2;
		
		if(x==y) {
			System.out.println("X is now equal to y");
		}
		
		x = x*2;
		
		if(x>y) {
			System.out.println("X is now greated than y");
		}
		
		if(x==y) {
			System.out.println("It will not be dispalyed");
		}
		
	}

}
