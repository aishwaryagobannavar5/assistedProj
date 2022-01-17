package construct;

public class Construct {
	int val=90;
	int empId;
	String name;
	void display() {
		System.out.println(empId+":"+name);
	}
	public static void main(String []args) {
		System.out.println(new Construct().val);
		Construct ref=new Construct();
		System.out.println(ref.val);
		 Construct emp1=new Construct();
		 emp1.display();
		 paraConstructor emp2=new paraConstructor(1734980,"abcde");
			 
		 }
	}
class paraConstructor{
	int empId;
	String name;
	private int val;

	paraConstructor(int empId,String name){
		this.empId=empId;
		this.name=name;
		System.out.println(empId+":"+name);
		
		
	}
   void UsingConstructor2(int val) {
		this.val=val;
	}
   
}