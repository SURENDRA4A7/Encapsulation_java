
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.setname("Snoopy");
		d.setcolor("White");
		d.setbreed("German");
		d.setage(6);
		
		System.out.println("The Dog name is "+d.getname());
		System.out.println("and it has color "+d.getcolor());
		System.out.println("It is "+d.getbreed()+" breed");
		System.out.println("T+he Age is "+d.getage());
	}

}
