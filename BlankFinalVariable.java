class BlankFinalVariable{
	final int x= getX();
	int getX(){
		System.out.println(x+"via get function");
		return 10;
	}
	BlankFinalVariable(){
		//x=0;(this line is inserted by the compiler)
		//x=getX();
		System.out.println(this.x+ "via constructors");
	}
	public static void main(String... s){
		new BlankFinalVariable();
	}
}