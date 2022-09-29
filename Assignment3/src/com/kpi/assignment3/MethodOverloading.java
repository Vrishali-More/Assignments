package com.kpi.assignment3;
// program for method overloading 
/**
 * @author VishaliMore
 *
 */
public class MethodOverloading {
static int add() {
	return 1;
}
static int add(int a, int b) { // method can overload method add()
	return a+b;
}
public static void main(String args[]) {
	MethodOverloading m1=new MethodOverloading();
	MethodOverloading m2= new MethodOverloading();
    System.out.println(m1.add());
    System.out.println(m2.add(4,5));
}
}
