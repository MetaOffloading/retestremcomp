package com.sam.webtasks.client;

import com.sam.webtasks.questionnaire.Questionnaire;

public class IUS12 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qIUS12 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qIUS12.name = "qIUS12";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qIUS12.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qIUS12.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		qIUS12.nItems = 12;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qIUS12.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qIUS12.questionWidth = 0.3;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qIUS12.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qIUS12.options[0] = "Not at all characteristic of me";
		qIUS12.options[1] = "A little characteristic of me";
		qIUS12.options[2] = "Somewhat characteristic of me";
		qIUS12.options[3] = "Very characteristic of me";
		qIUS12.options[4] = "Entirely characteristic of me";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qIUS12.items[0] = "Unforeseen events upset me greatly.";
		qIUS12.items[1] = "It frustrates me not having all the information I need.";
		qIUS12.items[2] = "Uncertainty keeps me from living a full life.";
		qIUS12.items[3] = "One should always look ahead so as to avoid surprises.";
		qIUS12.items[4] = "A small unforeseen event can spoil everything, even with the best of planning.";
		qIUS12.items[5] = "When it’s time to act, uncertainty paralyses me.";
		qIUS12.items[6] = "When I am uncertain I can’t function very well.";
		qIUS12.items[7] = "I always want to know what the future has in store for me.";
		qIUS12.items[8] = "I can’t stand being taken by surprise.";
		qIUS12.items[9] = "The smallest doubt can stop me from acting.";
		qIUS12.items[10] = "I should be able to organize everything in advance.";
		qIUS12.items[11] = "I must get away from all uncertain situations.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qIUS12.Run();
	}
}
