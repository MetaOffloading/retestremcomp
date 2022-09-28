package com.sam.webtasks.questionnaire;

import com.sam.webtasks.basictools.PHP;

public class QuestionnaireFlex {
	//name for this questionnaire (outputted in the results)
	public String name = "";
	
	//instruction test
	public String instructionText = "";
	
	//response options
	public int maxOptions = 1;
	public String[][] options;
	
	//number of items and corresponding responses
	public int nItems = 1;
	public String[] items;
	public int[] responses;
	
	//display options
	public double questionWidth = 0.3; //proportion of horizontal space taken up by the question
	public int itemsPerPage = 1;
	
	//these variables are used to track progress as the participant completes the questionnaire
	int offset = 0;
	int remainingItems;
	
	//initialise
	public void Init() {
		items = new String[nItems];
		responses = new int[nItems];
		remainingItems = itemsPerPage;
		options = new String[maxOptions][nItems];
	}

	//run the questionnaire
	public void Run() {
		RunQuestionnaireFlex.main(this);
	}
}
