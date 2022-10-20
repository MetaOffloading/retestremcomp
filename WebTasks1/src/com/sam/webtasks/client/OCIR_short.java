package com.sam.webtasks.client;
// Obsessive Compulsive Inventory - Revised (OCIR) by Foa, Huppert, Leiberg, Hajcak, Langner, et al. (2002)


import com.sam.webtasks.questionnaire.Questionnaire;

public class OCIR_short {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qOCIR_short = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qOCIR_short.name = "qOCIR_short";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qOCIR_short.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qOCIR_short.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		qOCIR_short.nItems = 11;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qOCIR_short.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qOCIR_short.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qOCIR_short.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qOCIR_short.options[0] = "Not at all";
		qOCIR_short.options[1] = "A little";
		qOCIR_short.options[2] = "Moderately";
		qOCIR_short.options[3] = "A lot";
		qOCIR_short.options[4] = "Extremely";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qOCIR_short.items[0] = "I have saved up so many things that they get in the way.";
		qOCIR_short.items[1] = "I check things more often than necessary.";
		qOCIR_short.items[2] = "I feel compelled to count while I am doing things.";
		qOCIR_short.items[3] = "I find it difficult to control my own thoughts.";
		qOCIR_short.items[4] = "I collect things I don’t need.";
		qOCIR_short.items[5] = "I get upset if others change the way I have arranged things.";
		qOCIR_short.items[6] = "I sometimes have to wash or clean myself simply because I feel contaminated.";
		qOCIR_short.items[7] = "I am upset by unpleasant thoughts that come into my mind against my will.";
		qOCIR_short.items[8] = "I avoid throwing things away because I am afraid I might need them later.";
		qOCIR_short.items[9] = "I feel that there are good and bad numbers.";
		qOCIR_short.items[10] = "I frequently get nasty thoughts and have difficulty in getting rid of them.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qOCIR_short.Run();
	}
}
