
public class H {
H(){
	System.out.println("H");
}
public void test (){
	System.out.println("from test");
 }
public static void main(String[] args) {
	new H().test ();
	System.out.println("main");
}
}
