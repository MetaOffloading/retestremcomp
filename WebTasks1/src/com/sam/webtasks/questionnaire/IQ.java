package com.sam.webtasks.questionnaire;

import com.sam.webtasks.basictools.PHP;

public class IQ {
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
	public String[][] imagefiles;
	public int[] responses;
	public int[] rt;
	
	//display options
	public double questionWidth = 0.3; //proportion of horizontal space taken up by the question
	public int itemsPerPage = 1;
	
	//these variables are used to track progress as the participant completes the questionnaire
	int offset = 0;
	int remainingItems;
	
	//initialise
	public void Init() {
		items = new String[nItems];
		imagefiles = new String[2][nItems];
		responses = new int[nItems];
		rt = new int[nItems];
		remainingItems = itemsPerPage;
		options = new String[maxOptions][nItems];
	}

	//run the questionnaire
	public void Run() {
		RunIQ.main(this);
	}
}
