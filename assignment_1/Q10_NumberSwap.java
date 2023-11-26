class NumberSwap{
    public static void main(String args[]) {
        int a = 10;
 	int b = 20;
	int c = 0; 

 	System.out.println("value of a  is " + a + " and b is "+ b + " before swap");
	c = a;
	a = b;
	b = c; 
        System.out.println("value of a  is " + a + " and b is "+ b + " after swap"); 
    }
}