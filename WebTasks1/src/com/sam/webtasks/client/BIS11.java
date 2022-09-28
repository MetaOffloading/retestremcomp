package com.sam.webtasks.client;
// Barratt Impulsiveness Scale (BIS11) by Patton, Stanford, & Barratt (1995)


import com.sam.webtasks.questionnaire.Questionnaire;

public class BIS11 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qBIS11 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qBIS11.name = "qBIS11";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qBIS11.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qBIS11.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qBIS11.nItems = 30;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qBIS11.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qBIS11.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qBIS11.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qBIS11.options[0] = "Do not agree at all";
		qBIS11.options[1] = "Agree slightly";
		qBIS11.options[2] = "Agree a lot";
		qBIS11.options[3] = "Agree completely";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		
		qBIS11.items[0] = "I plan tasks carefully.";
		qBIS11.items[1] = "I do things without thinking.";
		qBIS11.items[2] = "I make-up my mind quickly.";
		qBIS11.items[3] = "I am happy-go-lucky.";
		qBIS11.items[4] = "I don’t “pay attention”.";
		qBIS11.items[5] = "I have “racing” thoughts.";
		qBIS11.items[6] = "I plan trips well ahead of time.";
		qBIS11.items[7] = "I am self controlled.";
		qBIS11.items[8] = "I concentrate easily.";
		qBIS11.items[9] = "I save regularly.";
		qBIS11.items[10] = "I “squirm” at plays or lectures.";
		qBIS11.items[11] = "I am a careful thinker.";
		qBIS11.items[12] = "I plan for job security.";
		qBIS11.items[13] = "I say things without thinking.";
		qBIS11.items[14] = "I like to think about complex problems.";
		qBIS11.items[15] = "I change jobs.";
		qBIS11.items[16] = "I act “on impulse.";
		qBIS11.items[17] = "I get easily bored when solving thought problems.";
		qBIS11.items[18] = "I act on the spur of the moment.";
		qBIS11.items[19] = "I am a steady thinker.";
		qBIS11.items[20] = "I change residences.";
		qBIS11.items[21] = "I buy things on impulse.";
		qBIS11.items[22] = "I can only think about one thing at a time.";
		qBIS11.items[23] = "I change hobbies.";
		qBIS11.items[24] = "I spend or charge more than I earn.";
		qBIS11.items[25] = "I often have extraneous thoughts when thinking.";
		qBIS11.items[26] = "I am more interested in the present than the future.";
		qBIS11.items[27] = "I am restless at the theater or lectures.";
		qBIS11.items[28] = "I like puzzles.";
		qBIS11.items[29] = "I am future oriented.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qBIS11.Run();
	}
}
