
public class C {
C(){
	System.out.println("E");
}
C(int i){
System.out.println(i);	
}
public static void main(String[] args) {
	C c1 = new C();
	C c2 = new C(200);
}
}
