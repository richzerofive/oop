package collection;

import java.util.HashSet;

/**
 *@date   : 2016. 6. 23.
 *@author : 박승주
 *@file   : SetEx.java
 *@story  : 
*/
public class HashSetEx {
	public static void main(String[] args) {
		String[] str = {"Java","beans","Java","XML"};
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for(String n:str){
			if (!hs1.add(n)) {
				hs2.add(n);
			}
			System.out.println("hs1 :"+hs1);
			hs1.removeAll(hs2);
			System.out.println("hs1 :"+hs1);
			System.out.println("hs2 :"+hs2);
		}
		
	}
}
