package com.sam.webtasks.client;
// Zung Depression Scale (SDS) by Zung (1965)


import com.sam.webtasks.questionnaire.Questionnaire;

public class SDS_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qSDS_short = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qSDS_short.name = "qSDS_short";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qSDS_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qSDS_short.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qSDS_short.nItems = 8;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qSDS_short.itemsPerPage = 4;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qSDS_short.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qSDS_short.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qSDS_short.options[0] = "A little of the time";
		qSDS_short.options[1] = "Some of the time";
		qSDS_short.options[2] = "Good part of the time";
		qSDS_short.options[3] = "Most of the time";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qSDS_short.items[0] = "My mind is as clear as it used to be.";
		qSDS_short.items[1] = "I find it easy to do the things I used to do.";
		qSDS_short.items[2] = "I am restless and can't keep still.";
		qSDS_short.items[3] = "I feel hopeful about the future.";
		qSDS_short.items[4] = "I find it easy to make decisions.";
		qSDS_short.items[5] = "I feel that I am useful and needed.";
		qSDS_short.items[6] = "My life is pretty full.";
		qSDS_short.items[7] = "I still enjoy the things I used to do.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qSDS_short.Run();
	}
}
