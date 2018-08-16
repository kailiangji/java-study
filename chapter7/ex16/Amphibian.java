//: chapter7/ex16/Amphibian.java

public class Amphibian {
    private int age;
    Amphibian(int i) {
	age = i;
	System.out.println("I am an Amphibian");
    }

    public int getAge() { return age; }
    public void HowOldAreYou(Amphibian a) {
	System.out.printf("I am %d years old\n", a.getAge());
    }
}
