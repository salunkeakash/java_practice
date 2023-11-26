class SwapNumbers{
    public static void main(String args[]) {
        int a = 10;
 	int b = 20; 

 	System.out.println("value of a  is " + a + " and b is "+ b + " before swap");
	a = a+b;
	b = a-b;
	a = a-b; 
        System.out.println("value of a  is " + a + " and b is "+ b + " after swap"); 
    }
}