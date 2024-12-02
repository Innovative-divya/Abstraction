interface My{
	default void show(){
		System.out.println("my");
	}
}
interface My1{
	default void show(){
		System.out.println("M1");
	}
}
class Myregister{
	void register(My b){
		b.show();
	}
}
class Child implements My,My1{
	public void show(){
		System.out.println("child");
	}
	public static void main(String... s){
		Child c= new Child();
		Myregister mr= new Myregister();
		mr.register(c);
		My m=new Child();
		m.show();
		My1 m1=new Child();
		m1.show();
	}
}