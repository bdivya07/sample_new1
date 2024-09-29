package sample;

public class ArrayMorgan {
public static void main(String[] args) {
	AAA[] arrA;
	B[] arrB;
	
	arrA =new AAA[10];
	arrB = new B[20];
	arrA=arrB;
	arrB =(B[])arrA;
	arrA= new AAA[10];
	arrB = (B[])arrA;
}
}

class AAA
{
	
}
class B extends AAA
{
	
}