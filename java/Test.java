class StaticExample{
	public static int a=10;
	private int b;
	
	public int getB(){ return b; }

	publicvoid setB(int b){ return a*2; }
}
class Test{
	public static void main(String[] args) {
		System.out.println(StaticExample.a);
		System.out.println(StaticExample.multiplyByTwo(a:5));
		StaticExample staticExample= new StaticExample();
		System.out.println(staticExample.getB());
		System.out.println(staticExample.a);
	}
}