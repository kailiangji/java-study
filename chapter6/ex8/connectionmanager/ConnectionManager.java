//: ConnectionManager.java
package chapter6.ex8.connectionmanager;

public class ConnectionManager {
    static Connection[] c = new Connection[]{new Connection(), new Connection(), new Connection()};
    static int i = 0;
    public static Connection getConnection() {
	if (i < c.length) {
	    i++;
	    return c[i-1];
	}
	return null;
    }
}
