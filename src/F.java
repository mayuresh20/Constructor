
public class F {
F(){
	System.out.println("F");
}
public static void main(String[] args) {
	F f1 = new F();
	f1.test();
	System.out.println("main");
	}
public void test (){
	System.out.println ("from test");
}
}
