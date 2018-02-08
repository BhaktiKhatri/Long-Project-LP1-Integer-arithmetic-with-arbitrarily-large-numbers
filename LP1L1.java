// Sample code for Level 1 driver for lp1

// Change following line to your group number
package cs6301.g45.l1;

public class LP1L1 {
    public static void main(String[] args) {
	Num x = new Num(211);
	Num y = new Num(2);
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	Num z = Num.add(x, y);
	System.out.println(z);
	Num z1 = Num.subtract(x, y);
	System.out.println(z1);
	//Num a = Num.power(x, 8);
	//System.out.println(a);
	//z.printList();
    }
}
