package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class STAI_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qSTAI_short = new Questionnaire();
		
		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qSTAI_short.name = "qSTAI_short";
		
		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qSTAI_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";   
		
		//How many response options does the questionnaire have?
		qSTAI_short.nOptions = 4;
		
		//How many items (i.e. questions) does the questionnaire have?
		qSTAI_short.nItems = 11;
		
		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qSTAI_short.itemsPerPage = 6;
		
		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qSTAI_short.questionWidth = 0.25;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		qSTAI_short.Init();
		
		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qSTAI_short.options[0] = "Almost<br>never";
		qSTAI_short.options[1] = "Sometimes";
		qSTAI_short.options[2] = "Often";
		qSTAI_short.options[3] = "Almost<br>always";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qSTAI_short.items[0] = "I feel pleasant";
		qSTAI_short.items[1] = "I feel satisfied with myself";
		qSTAI_short.items[2] = "I feel like a failure";
		qSTAI_short.items[3] = "I feel that difficulties are piling up so that I cannot overcome them";
		qSTAI_short.items[4] = "I worry too much over something that does not really matter";
		qSTAI_short.items[5] = "I am happy";
		qSTAI_short.items[6] = "I lack self-confidence";
		qSTAI_short.items[7] = "I feel secure";
		qSTAI_short.items[8] = "I am content";
		qSTAI_short.items[9] = "I am a steady person";
		qSTAI_short.items[10] = "I get in a state of tension or turmoil as I think over my recent concerns and interests";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qSTAI_short.Run();
	}
}
