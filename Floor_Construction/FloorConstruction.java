package com.greatlearning.dsa;

import java.util.Stack;

public class FloorConstruction {

	private Stack<Integer> floorSizesStack = new Stack<>();

	public FloorConstruction() {

		System.out.println("The order of construction is as follows:");

	}

	public void constructFloor(int totalfloor, int[] floorSizes)

	{

		for (int i = 0; i < floorSizes.length; i++) {

			System.out.println("\n\nDay: " + (i + 1));

			if (floorSizes[i] != totalfloor) {

				System.out.print(" ");

				floorSizesStack.push(floorSizes[i]);

			} else {

				totalfloor--;

				System.out.print(floorSizes[i] + " ");

			}
			while (!floorSizesStack.isEmpty() && totalfloor == floorSizesStack.peek())

			{

				totalfloor--;

				System.out.print(floorSizesStack.pop() + " ");

			}

		}

	}

}