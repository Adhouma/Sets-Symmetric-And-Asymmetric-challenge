package com.learn.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	/**
	 * Create two sets Nature and Devine 
	 * 
	 * - Nature's words: "all", "nature", "is", "but", "art", "unknown", "to", "thee"
	 * 
	 * - Devine's words: "to", "err", "is", "human", "to", "forgive", "devine"
	 * 
	 * Your challenge is print out the two sets and determine the union and the
	 * intersection of the two sets
	 *  
	 * PS:
	 * See the image in the description folder for more details
	 */
	public static void main(String[] args) {

		Set<String> nature = new HashSet<>();
		Set<String> devine = new HashSet<>();

		String[] natureWords = { "all", "nature", "is", "but", "art", "unknown", "to", "thee" };
		String[] devineWords = { "to", "err", "is", "human", "to", "forgive", "devine" };

		nature.addAll(Arrays.asList(natureWords));
		devine.addAll(Arrays.asList(devineWords));

		System.out.println("/*--- Nature ---*/");
		printSet(nature);

		System.out.println("/*--- Devine ---*/");
		printSet(devine);

		System.out.println("/*--- Union ---*/");
		Set<String> union = new HashSet<>(nature);
		union.addAll(devine);
		printSet(union);

		System.out.println("/*--- Intersection ---*/");
		Set<String> intersection = new HashSet<>(nature);
		intersection.retainAll(devine);
		printSet(intersection);
	}

	private static void printSet(Set<String> set) {
		for (String word : set) {
			System.out.print(word + " ");
		}

		System.out.println();
	}

}
