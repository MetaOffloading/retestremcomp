package com.sam.webtasks.client;
// Barratt Impulsiveness Scale (BIS11) by Patton, Stanford, & Barratt (1995)


import com.sam.webtasks.questionnaire.Questionnaire;

public class BIS11_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qBIS11_short = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qBIS11_short.name = "qBIS11_short";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qBIS11_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qBIS11_short.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qBIS11_short.nItems = 12;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qBIS11_short.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qBIS11_short.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qBIS11_short.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qBIS11_short.options[0] = "Do not agree at all";
		qBIS11_short.options[1] = "Agree slightly";
		qBIS11_short.options[2] = "Agree a lot";
		qBIS11_short.options[3] = "Agree completely";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		
		qBIS11_short.items[0] = "I plan tasks carefully.";
		qBIS11_short.items[1] = "I have “racing” thoughts.";
		qBIS11_short.items[2] = "I concentrate easily.";
		qBIS11_short.items[3] = "I plan for job security.";
		qBIS11_short.items[4] = "I say things without thinking.";
		qBIS11_short.items[5] = "I like to think about complex problems.";
		qBIS11_short.items[6] = "I act \"on impulse\".";
		qBIS11_short.items[7] = "I am a steady thinker.";
		qBIS11_short.items[8] = "I buy things on impulse.";
		qBIS11_short.items[9] = "I spend or charge more than I earn.";
		qBIS11_short.items[10] = "I often have extraneous thoughts when thinking.";
		qBIS11_short.items[11] = "I competed in the 1917 Summer Olympics Games.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qBIS11_short.Run();
	}
}
