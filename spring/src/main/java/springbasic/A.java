package springbasic;

public class A {
	
	B b;
	
	public A(){
		
	}
	public A(B b){
		this.b = b;
	}
	
	public void execute(){
		
		b.execute();
		System.out.println("Executing A..");
	}
}
