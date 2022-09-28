package com.sam.webtasks.client;
// Obsessive Compulsive Inventory - Revised (OCIR) by Foa, Huppert, Leiberg, Hajcak, Langner, et al. (2002)


import com.sam.webtasks.questionnaire.Questionnaire;

public class OCIR {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qOCIR = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qOCIR.name = "qOCIR";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qOCIR.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qOCIR.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		qOCIR.nItems = 18;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qOCIR.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qOCIR.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qOCIR.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qOCIR.options[0] = "Not at all";
		qOCIR.options[1] = "A little";
		qOCIR.options[2] = "Moderately";
		qOCIR.options[3] = "A lot";
		qOCIR.options[4] = "Extremely";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qOCIR.items[0] = "I have saved up so many things that they get in the way.";
		qOCIR.items[1] = "I check things more often than necessary.";
		qOCIR.items[2] = "I get upset if objects are not arranged properly.";
		qOCIR.items[3] = "I feel compelled to count while I am doing things.";
		qOCIR.items[4] = "I find it difficult to touch an object when I know it has been touched by strangers or certain people.";
		qOCIR.items[5] = "I find it difficult to control my own thoughts.";
		qOCIR.items[6] = "I collect things I don’t need.";
		qOCIR.items[7] = "I repeatedly check doors, windows, drawers, etc.";
		qOCIR.items[8] = "I get upset if others change the way I have arranged things.";
		qOCIR.items[9] = "I feel I have to repeat certain numbers.";
		qOCIR.items[10] = "I sometimes have to wash or clean myself simply because I feel contaminated.";
		qOCIR.items[11] = "I am upset by unpleasant thoughts that come into my mind against my will.";
		qOCIR.items[12] = "I avoid throwing things away because I am afraid I might need them later.";
		qOCIR.items[13] = "I repeatedly check gas and water taps and light switches after turning them off.";
		qOCIR.items[14] = "I need things to be arranged in a particular way.";
		qOCIR.items[15] = "I feel that there are good and bad numbers.";
		qOCIR.items[16] = "I wash my hands more often and longer than necessary.";
		qOCIR.items[17] = "I frequently get nasty thoughts and have difficulty in getting rid of them.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qOCIR.Run();
	}
}
