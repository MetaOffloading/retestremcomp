package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireFlex;

public class AES {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireFlex qAES = new QuestionnaireFlex();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qAES.name = "qAES";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qAES.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qAES.maxOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qAES.nItems = 18;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qAES.itemsPerPage = 3;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qAES.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qAES.Init();
		
		for (int o=0;o<qAES.nItems;o++) {
			qAES.options[0][o] = "";
			qAES.options[1][o] = "";
			qAES.options[2][o] = "";
			qAES.options[3][o] = "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qAES.items[0] = "I am interested in things.";
		qAES.options[0][0] = "Not at all characteristic (0 instances).";
		qAES.options[1][0] = "Slightly characteristic (1-2 instances).";
		qAES.options[2][0] = "Somewhat characteristic (2-3 instances).";
		qAES.options[3][0] = "Very characteristic (3 or more instances).";
		qAES.items[1] = "I get things done during the day.";
		qAES.options[0][1] = "Not at all characteristic (0 instances).";
		qAES.options[1][1] = "Slightly characteristic (1-2 instances).";
		qAES.options[2][1] = "Somewhat characteristic (2-3 instances).";
		qAES.options[3][1] = "Very characteristic (3 or more instances).";
		qAES.items[2] = "Getting things started on my own is important to me.";
		qAES.options[0][2] = "Not at all characteristic.";
		qAES.options[1][2] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][2] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][2] = "Very characteristic (a great deal, strongly).";
		qAES.items[3] = "I am interested in having new experiences.";
		qAES.options[0][3] = "Not at all characteristic (0 instances).";
		qAES.options[1][3] = "Slightly characteristic (1-2 instances).";
		qAES.options[2][3] = "Somewhat characteristic (2-3 instances).";
		qAES.options[3][3] = "Very characteristic (3 or more instances).";
		qAES.items[4] = "I am interested in learning new things.";
		qAES.options[0][4] = "Not at all characteristic (0 instances).";
		qAES.options[1][4] = "Slightly characteristic (1-2 instances).";
		qAES.options[2][4] = "Somewhat characteristic (2-3 instances).";
		qAES.options[3][4] = "Very characteristic (3 or more instances).";
		qAES.items[5] = "I put little effort into anything.";
		qAES.options[0][5] = "Not at all characteristic.";
		qAES.options[1][5] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][5] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][5] = "Very characteristic (a great deal, strongly).";
		qAES.items[6] = "I approach life with intensity.";
		qAES.options[0][6] = "Not at all characteristic.";
		qAES.options[1][6] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][6] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][6] = "Very characteristic (a great deal, strongly).";
		qAES.items[7] = "Seeing a job through to the end is important to me.";
		qAES.options[0][7] = "Not at all characteristic.";
		qAES.options[1][7] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][7] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][7] = "Very characteristic (a great deal, strongly).";
		qAES.items[8] = "I spend time doing things that interest me.";
		qAES.options[0][8] = "Not at all characteristic.";
		qAES.options[1][8] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][8] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][8] = "Very characteristic (a great deal, strongly).";
		qAES.items[9] = "Someone has to tell me what to do each day.";
		qAES.options[0][9] = "Not at all characteristic.";
		qAES.options[1][9] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][9] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][9] = "Very characteristic (a great deal, strongly).";
		qAES.items[10] = "I am less concerned about her/his problems than I should be.";
		qAES.options[0][10] = "Not at all characteristic.";
		qAES.options[1][10] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][10] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][10] = "Very characteristic (a great deal, strongly).";
		qAES.items[11] = "I have friends.";
		qAES.options[0][11] = "Not at all characteristic (0 instances).";
		qAES.options[1][11] = "Slightly characteristic (1-2 instances).";
		qAES.options[2][11] = "Somewhat characteristic (2-3 instances).";
		qAES.options[3][11] = "Very characteristic (3 or more instances).";
		qAES.items[12] = "Getting together with friends is important to me.";
		qAES.options[0][12] = "Not at all characteristic.";
		qAES.options[1][12] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][12] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][12] = "Very characteristic (a great deal, strongly).";
		qAES.items[13] = "When something good happens, I get excited.";
		qAES.options[0][13] = "Not at all characteristic.";
		qAES.options[1][13] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][13] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][13] = "Very characteristic (a great deal, strongly).";
		qAES.items[14] = "I have an accurate understanding of my problems.";
		qAES.options[0][14] = "Not at all characteristic.";
		qAES.options[1][14] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][14] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][14] = "Very characteristic (a great deal, strongly).";
		qAES.items[15] = "Getting things done during the day is important to me.";
		qAES.options[0][15] = "Not at all characteristic.";
		qAES.options[1][15] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][15] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][15] = "Very characteristic (a great deal, strongly).";
		qAES.items[16] = "I have initiative.";
		qAES.options[0][16] = "Not at all characteristic.";
		qAES.options[1][16] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][16] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][16] = "Very characteristic (a great deal, strongly).";
		qAES.items[17] = "I have motivation.";
		qAES.options[0][17] = "Not at all characteristic.";
		qAES.options[1][17] = "Slightly characteristic (trivial, questionable, minimal).";
		qAES.options[2][17] = "Somewhat characteristic (moderate, definite).";
		qAES.options[3][17] = "Very characteristic (a great deal, strongly).";


		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qAES.Run();
	}
}
