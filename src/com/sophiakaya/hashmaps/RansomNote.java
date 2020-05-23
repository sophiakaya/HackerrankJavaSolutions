package com.sophiakaya.hashmaps;

import java.util.HashMap;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

	boolean check = false;

	HashMap<String, Integer> myMagazine = new HashMap<>();

	for (int i = 0; i < magazine.length; i++) {

	    if (myMagazine.get(magazine[i]) != null)
		myMagazine.put(magazine[i], myMagazine.get(magazine[i]) + 1);
	    else
		myMagazine.put(magazine[i], 1);

	}

	HashMap<String, Integer> myNote = new HashMap<>();

	for (int i = 0; i < note.length; i++) {

	    if (myNote.get(note[i]) != null)
		myNote.put(note[i], myNote.get(note[i]) + 1);
	    else
		myNote.put(note[i], 1);

	}

	if (myMagazine.size() < myNote.size()) {
	    check = false;

	} else {

	    if (!myMagazine.keySet().containsAll(myNote.keySet())) {
		check = false;
	    } else {

		if (myNote.entrySet().stream().allMatch(e -> myMagazine.get(e.getKey()) >= e.getValue())) {

		    check = true;
		} else {
		    check = false;
		}
	    }
	}

	if (check)
	    System.out.println("Yes");
	else
	    System.out.println("No");

    }

    public static void main(String[] args) {

	checkMagazine(new String[] { "give", "me", "one", "grand", "today", "night" },
		new String[] { "give", "me", "one", "grand", "today" });
	checkMagazine(new String[] { "two", "times", "three", "is", "not", "four" },
		new String[] { "two", "times", "two", "is", "four" });
	checkMagazine(new String[] { "ive", "got", "a", "lovely", "bunch", "of", "coconuts" },
		new String[] { "ive", "got", "some", "coconuts" });

    }

}
