package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (AUDIT) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.QuestionnaireFlex;

public class AUDIT {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireFlex qAUDIT = new QuestionnaireFlex();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qAUDIT.name = "qAUDIT";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qAUDIT.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qAUDIT.maxOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		qAUDIT.nItems = 10;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qAUDIT.itemsPerPage = 5;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qAUDIT.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qAUDIT.Init();
		
		for (int o=0;o<qAUDIT.nItems;o++) {
			qAUDIT.options[0][o] = "";
			qAUDIT.options[1][o] = "";
			qAUDIT.options[2][o] = "";
			qAUDIT.options[3][o] = "";
			qAUDIT.options[4][o] = "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qAUDIT.items[0] = "How often do you have a drink containing alcohol?";
		qAUDIT.options[0][0] = "Never";
		qAUDIT.options[1][0] = "Monthly or less";
		qAUDIT.options[2][0] = "Two to four times a month";
		qAUDIT.options[3][0] = "Two to three times a week";
		qAUDIT.options[4][0] = "Four or more times a week";
		qAUDIT.items[1] = "How many drinks containing alcohol do you have on a typical day when you are drinking?";
		qAUDIT.options[0][1] = "1 or 2";
		qAUDIT.options[1][1] = "3 or 4";
		qAUDIT.options[2][1] = "5 or 6";
		qAUDIT.options[3][1] = "7 to 9";
		qAUDIT.options[4][1] = "10 or more";
		qAUDIT.items[2] = "How often do you have six or more drinks on one occasion?";
		qAUDIT.options[0][2] = "Never";
		qAUDIT.options[1][2] = "Less than monthly";
		qAUDIT.options[2][2] = "Monthly";
		qAUDIT.options[3][2] = "Weekly";
		qAUDIT.options[4][2] = "Daily or almost daily";
		qAUDIT.items[3] = "How often during the last year have you found that you were not able to stop drinking once you had started?";
		qAUDIT.options[0][3] = "Never";
		qAUDIT.options[1][3] = "Less than monthly";
		qAUDIT.options[2][3] = "Monthly";
		qAUDIT.options[3][3] = "Weekly";
		qAUDIT.options[4][3] = "Daily or almost daily";
		qAUDIT.items[4] = "How often during the last year have you failed to do what was normally expected from you because of drinking?";
		qAUDIT.options[0][4] = "Never";
		qAUDIT.options[1][4] = "Less than monthly";
		qAUDIT.options[2][4] = "Monthly";
		qAUDIT.options[3][4] = "Weekly";
		qAUDIT.options[4][4] = "Daily or almost daily";
		qAUDIT.items[5] = "How often during the last year have you needed a first drink in the morning to get yourself going after a heavy drinking session?";
		qAUDIT.options[0][5] = "Never";
		qAUDIT.options[1][5] = "Less than monthly";
		qAUDIT.options[2][5] = "Monthly";
		qAUDIT.options[3][5] = "Weekly";
		qAUDIT.options[4][5] = "Daily or almost daily";
		qAUDIT.items[6] = "How often during the last year have you had a feeling of guilt or remorse after drinking?";
		qAUDIT.options[0][6] = "Never";
		qAUDIT.options[1][6] = "Less than monthly";
		qAUDIT.options[2][6] = "Monthly";
		qAUDIT.options[3][6] = "Weekly";
		qAUDIT.options[4][6] = "Daily or almost daily";
		qAUDIT.items[7] = "How often during the last year have you been unable to remember what happened the night before because you had been drinking?";
		qAUDIT.options[0][7] = "Never";
		qAUDIT.options[1][7] = "Less than monthly";
		qAUDIT.options[2][7] = "Monthly";
		qAUDIT.options[3][7] = "Weekly";
		qAUDIT.options[4][7] = "Daily or almost daily";
		qAUDIT.items[8] = "Have you or someone else been injured as a result of your drinking?";
		qAUDIT.options[0][8] = "No";
		qAUDIT.options[1][8] = "Yes but not in the last year";
		qAUDIT.options[2][8] = "Yes during the last year";
		qAUDIT.items[9] = "Has a relative or friend, or a doctor or other health worker been concerned about your drinking or suggested you cut down?";
		qAUDIT.options[0][9] = "No";
		qAUDIT.options[1][9] = "Yes but not in the last year";
		qAUDIT.options[2][9] = "Yes during the last year";


		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qAUDIT.Run();
	}
}
