package demo1;

public abstract class C implements B {
	abstract void print() ;
	public void print_f() {
		System.out.println("C类 实现了 B类 的接口");
	}
}
