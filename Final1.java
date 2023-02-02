package access_Modifier;


 class Test{
	void mNumber()
	{
		System.out.println("4398348058405");
	
	}
	void atmPIN() {
		System.out.println("89474");
	}
}
class Thief extends Test
{
	@Override
	void mNumber() {
		System.out.println("4398348058405");
	}
	@Override
	void atmPIN()
	{
		System.out.println("89474");
	}
}
public class Final1 {
	public static void main(String[] args ) {
		Thief t=new Thief();
		t.mNumber(); t.atmPIN();
		

}
}
