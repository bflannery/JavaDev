
public class Puppy {
	
	int puppyAge;
	
	//Constructor 
	public Puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is :" + name );
	}
	
	//Set Method
	//Takes age parameter
	public void setAge(int age) {
		puppyAge = age;
	}
	
	//Get Method
	public int getAge() {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String []args) {
		// Following statement would create an object myPuppy
		Puppy myPuppy = new Puppy( "tommy" );
		
		//Set Puppy Age
		myPuppy.setAge(2);
		
		//Get Puppy Age 
		myPuppy.getAge();
		
		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}
