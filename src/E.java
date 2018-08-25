
public class E {
E(){
	E e1 = new E(100);
	System.out.println("E");
	}
E (int i){
	System.out.println(i);
    }
public static void main(String[] args) {
	E e2= new E();
}
}
