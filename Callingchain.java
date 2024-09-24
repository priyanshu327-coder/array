class Callingchain{
	void show(){
		int x=10/0;
	}
	
	void display(){
	show();}
	void xyz(){
		display();
	}
	public static void main(String ...s){
		try{
		new Callingchain().xyz();}
		catch(Exception e){
			System.out.print(e);
			e.printStackTrace();
		}
}}