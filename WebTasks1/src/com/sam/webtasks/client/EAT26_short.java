package com.sam.webtasks.client;
// Eating Attitudes Test (EAT26) by Garner, Olmsted, Bohr, & Garfinkel (1982)


import com.sam.webtasks.questionnaire.Questionnaire;

public class EAT26_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qEAT26_short = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qEAT26_short.name = "qEAT26_short";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qEAT26_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qEAT26_short.nOptions = 6;

		//How many items (i.e. questions) does the questionnaire have?
		qEAT26_short.nItems = 4;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qEAT26_short.itemsPerPage = 4;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qEAT26_short.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qEAT26_short.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qEAT26_short.options[0] = "Always";
		qEAT26_short.options[1] = "Usually";
		qEAT26_short.options[2] = "Often";
		qEAT26_short.options[3] = "Sometimes";
		qEAT26_short.options[4] = "Rarely";
		qEAT26_short.options[5] = "Never";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qEAT26_short.items[0] = "I am terrified about being overweight.";
		qEAT26_short.items[1] = "I am preoccupied with a desire to be thinner.";
		qEAT26_short.items[2] = "I think about burning up calories when I exercise.";
		qEAT26_short.items[3] = "I am preoccupied with the thought of having fat on my body.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qEAT26_short.Run();
	}
}
