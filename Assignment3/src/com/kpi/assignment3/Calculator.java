package com.kpi.assignment3;

	/**
	 * @author VishaliMore
	 *
	 */
	// Creating a functional interface in two ways 
	// 1)lambda expression to implement a user defined functional interface
	

	@FunctionalInterface
	interface Cal{
		int add(int x);
	}

	public class Calculator {
		
		public static void main(String args[]) {
			int a=4;
			
			// lambda expression to define add method
			Cal ad=(int x) ->x*x;
			int ans = ad.add(a);
			System.out.println(ans);

			}

			
		}

