interface My{
	void show();//by default pblic and abstract
}
interface My1 extends My{
	void display();
}
interface My2 extends My,My1{
	void xyz();
}
class Child implements My,My1{
	private public void show(){
		System.out.println("show");
	}
	public void display(){
		System.out.println("display");
	}
	public static void main(String... s){
		My m=new Child();
		m.show();
		My1 m1= new Child();
		m1.show();
		m1.display();
	}
}
		