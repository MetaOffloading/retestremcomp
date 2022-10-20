package com.sam.webtasks.client;

import java.util.ArrayList;
import java.util.Collections;

import com.google.gwt.user.client.Random;

public class SetQuestOrder {
	public static ArrayList<Integer> questOrder = new ArrayList<Integer>();
	
	public static void Run() {
		
		// add questionnaire numbers
		questOrder.add(0);
		questOrder.add(1);
		questOrder.add(2);
		questOrder.add(3);
		questOrder.add(4);
		questOrder.add(5);
		// now shuffle
		for (int i = 0; i < questOrder.size(); i++) {
			Collections.swap(questOrder, i, Random.nextInt(questOrder.size()));
		}
		
	}
}
