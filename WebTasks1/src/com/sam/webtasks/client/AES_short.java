package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireFlex;

public class AES_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireFlex qAES_short = new QuestionnaireFlex();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qAES_short.name = "qAES_short";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qAES_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.<br><br>"
				+ "Where it asks for <i>instances</i>, please think of how many examples you can think of "
				+ "within a 24 hour period.";

		//How many response options does the questionnaire have?
		qAES_short.maxOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qAES_short.nItems = 4;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qAES_short.itemsPerPage = 4;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qAES_short.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qAES_short.Init();
		
		for (int o=0;o<qAES_short.nItems;o++) {
			qAES_short.options[0][o] = "";
			qAES_short.options[1][o] = "";
			qAES_short.options[2][o] = "";
			qAES_short.options[3][o] = "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qAES_short.items[0] = "I get things done during the day.";
		qAES_short.options[0][0] = "Not at all characteristic (0 instances).";
		qAES_short.options[1][0] = "Slightly characteristic (1-2 instances).";
		qAES_short.options[2][0] = "Somewhat characteristic (2-3 instances).";
		qAES_short.options[3][0] = "Very characteristic (3 or more instances).";
		qAES_short.items[1] = "I approach life with intensity.";
		qAES_short.options[0][1] = "Not at all characteristic.";
		qAES_short.options[1][1] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES_short.options[2][1] = "Somewhat characteristic (moderate, definite).";
		qAES_short.options[3][1] = "Very characteristic (a great deal, strongly).";
		qAES_short.items[2] = "I have initiative.";
		qAES_short.options[0][2] = "Not at all characteristic.";
		qAES_short.options[1][2] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES_short.options[2][2] = "Somewhat characteristic (moderate, definite).";
		qAES_short.options[3][2] = "Very characteristic (a great deal, strongly).";
		qAES_short.items[3] = "I have motivation.";
		qAES_short.options[0][3] = "Not at all characteristic.";
		qAES_short.options[1][3] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES_short.options[2][3] = "Somewhat characteristic (moderate, definite).";
		qAES_short.options[3][3] = "Very characteristic (a great deal, strongly).";


		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qAES_short.Run();
	}
}
