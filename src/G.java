
public class G {
G(){
	System.out.println("G");
}
public static void main(String[] args) {
	G.test();
	G g1 = new G();
	g1.test();
	System.out.println("Main");
}
public static void test(){
	System.out.println("test");
}
}
