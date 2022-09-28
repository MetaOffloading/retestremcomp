package com.sam.webtasks.client;
// Eating Attitudes Test (EAT26) by Garner, Olmsted, Bohr, & Garfinkel (1982)


import com.sam.webtasks.questionnaire.Questionnaire;

public class EAT26 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qEAT26 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qEAT26.name = "qEAT26";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qEAT26.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qEAT26.nOptions = 6;

		//How many items (i.e. questions) does the questionnaire have?
		qEAT26.nItems = 26;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qEAT26.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qEAT26.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qEAT26.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qEAT26.options[0] = "Always";
		qEAT26.options[1] = "Usually";
		qEAT26.options[2] = "Often";
		qEAT26.options[3] = "Sometimes";
		qEAT26.options[4] = "Rarely";
		qEAT26.options[5] = "Never";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qEAT26.items[0] = "I am terrified about being overweight.";
		qEAT26.items[1] = "I avoid eating when I am hungry.";
		qEAT26.items[2] = "I find myself preoccupied with food.";
		qEAT26.items[3] = "I have gone on eating binges where I feel that I may not be able to stop.";
		qEAT26.items[4] = "I cut my food into small pieces.";
		qEAT26.items[5] = "I am aware of the calorie content of foods I eat.";
		qEAT26.items[6] = "I particularly avoid foods with high carbohydrate content.";
		qEAT26.items[7] = "I feel that others would prefer if I ate more.";
		qEAT26.items[8] = "I vomit after I have eaten.";
		qEAT26.items[9] = "I feel extremely guilty after eating.";
		qEAT26.items[10] = "I am preoccupied with a desire to be thinner.";
		qEAT26.items[11] = "I think about burning up calories when I exercise.";
		qEAT26.items[12] = "Other people think that I am too thin.";
		qEAT26.items[13] = "I am preoccupied with the thought of having fat on my body.";
		qEAT26.items[14] = "I take longer than others to eat meals.";
		qEAT26.items[15] = "I avoid foods with sugar in them.";
		qEAT26.items[16] = "I eat diet foods.";
		qEAT26.items[17] = "I feel that food controls my life.";
		qEAT26.items[18] = "I display self-control around food.";
		qEAT26.items[19] = "I feel that others pressure me to eat.";
		qEAT26.items[20] = "I give too much time and thought to food.";
		qEAT26.items[21] = "I feel uncomfortable after eating sweets.";
		qEAT26.items[22] = "I engage in dieting behaviour.";
		qEAT26.items[23] = "I like my stomach to be empty.";
		qEAT26.items[24] = "I enjoy trying new rich foods.";
		qEAT26.items[25] = "I have the impulse to vomit after meals.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qEAT26.Run();
	}
}
