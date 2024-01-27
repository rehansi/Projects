package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.dsa.FloorConstruction;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the total number of floors in the building:");

		int totalfloor = sc.nextInt(); // this works as total size of array

		int[] floorSizes = new int[totalfloor]; // this works as value inside array

		for (int i = 0; i < floorSizes.length; i++) {

			System.out.println("Enter the floor size on day :" + (i + 1));

			int size = sc.nextInt();

			if (size <= 0) {

				System.out.println("\nFloor size cannot be less than or equal to zero");

			}

			else if (size > totalfloor) {

				System.out.println("\nFloor size cannot be greater than totalfloor");

			}

			else {

				floorSizes[i] = size;

			}
		}

		FloorConstruction fConstruction = new FloorConstruction();

		fConstruction.constructFloor(totalfloor, floorSizes);
		sc.close();
	}

}