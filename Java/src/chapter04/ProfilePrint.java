package chapter04;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMarried(boolean flag) {
		this.isMarried = flag;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	public static void main(String[] args) {
		ProfilePrint prof = new ProfilePrint();
		prof.setAge((byte)30);
		prof.setName("East");
		prof.setMarried(false);
		
		System.out.println(prof.getAge());
		System.out.println(prof.getName());
		System.out.println(prof.isMarried());
	}
}
