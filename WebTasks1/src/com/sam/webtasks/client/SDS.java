package com.sam.webtasks.client;
// Zung Depression Scale (SDS) by Zung (1965)


import com.sam.webtasks.questionnaire.Questionnaire;

public class SDS {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qSDS = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qSDS.name = "qSDS";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qSDS.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qSDS.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qSDS.nItems = 20;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qSDS.itemsPerPage = 7;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qSDS.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qSDS.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qSDS.options[0] = "A little of the time";
		qSDS.options[1] = "Some of the time";
		qSDS.options[2] = "Good part of the time";
		qSDS.options[3] = "Most of the time";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qSDS.items[0] = "I feel down-hearted and blue.";
		qSDS.items[1] = "Morning is when I feel the best.";
		qSDS.items[2] = "I have crying spells or feel like it.";
		qSDS.items[3] = "I have trouble sleeping at night.";
		qSDS.items[4] = "I eat as much as I used to.";
		qSDS.items[5] = "I still enjoy sex.";
		qSDS.items[6] = "I notice that I am losing weight.";
		qSDS.items[7] = "I have trouble with constipation.";
		qSDS.items[8] = "My heart beats faster than normal.";
		qSDS.items[9] = "I get tired for no reason.";
		qSDS.items[10] = "My mind is as clear as it used to be.";
		qSDS.items[11] = "I find it easy to do the things I used to do.";
		qSDS.items[12] = "I am restless and can't keep still.";
		qSDS.items[13] = "I feel hopeful about the future.";
		qSDS.items[14] = "I am more irritable than usual.";
		qSDS.items[15] = "I find it easy to make decisions.";
		qSDS.items[16] = "I feel that I am useful and needed.";
		qSDS.items[17] = "My life is pretty full.";
		qSDS.items[18] = "I feel that others would be better off if I were dead.";
		qSDS.items[19] = "I still enjoy the things I used to do.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qSDS.Run();
	}
}
