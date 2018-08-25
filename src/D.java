
public class D {
D(){
	System.out.println("D");
}
D(int i){
	System.out.println(i);
	}
D(String x, int k){
	System.out.print(x);
	System.out.print(",");
    System.out.print(k);
}
public static void main(String[] args) {
	D d1 = new D();
	D d2 = new D(100);
	D d3 = new D ("test",10);
}
}
