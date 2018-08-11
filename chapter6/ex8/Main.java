//: Main.java

import chapter6.ex8.connectionmanager.*;

public class Main {
    public static void main(String[] args) {
	ConnectionManager cm = new ConnectionManager();

	Connection c;

	c = cm.getConnection();
	System.out.println(c);

	c = cm.getConnection();
	System.out.println(c);

	c = cm.getConnection();
	System.out.println(c);

	c = cm.getConnection();
	System.out.println(c);
    }
}
