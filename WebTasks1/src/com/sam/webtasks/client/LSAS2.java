package com.sam.webtasks.client;
// Zung Depression Scale (LSAS2) by Zung (1965)


import com.sam.webtasks.questionnaire.Questionnaire;

public class LSAS2 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qLSAS2 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qLSAS2.name = "qLSAS2";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qLSAS2.instructionText = "Now, please rate then the same items again but this time regarding avoidance of these situations.";

		//How many response options does the questionnaire have?
		qLSAS2.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		qLSAS2.nItems = 20;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qLSAS2.itemsPerPage = 7;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qLSAS2.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qLSAS2.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qLSAS2.options[0] = "Never (0%)";
		qLSAS2.options[1] = "Occasionally (1—33%)";
		qLSAS2.options[2] = "Often (33—67%)";
		qLSAS2.options[3] = "Usually (67—100%) ";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qLSAS2.items[0] = "Telephoning in public.";
		qLSAS2.items[1] = "Participating in small groups.";
		qLSAS2.items[2] = "Eating in public places.";
		qLSAS2.items[3] = "Drinking with others in public places.";
		qLSAS2.items[4] = "Talking to people in authority.";
		qLSAS2.items[5] = "Acting, performing or giving a talk in front of an audience.";
		qLSAS2.items[6] = "Going to a party.";
		qLSAS2.items[7] = "Working while being observed.";
		qLSAS2.items[8] = "Writing while being observed.";
		qLSAS2.items[9] = "Calling someone you don’t know very well.";
		qLSAS2.items[10] = "Talking with people you don’t know very well.";
		qLSAS2.items[11] = "Meeting strangers.";
		qLSAS2.items[12] = "Urinating in a public bathroom.";
		qLSAS2.items[13] = "Entering a room when others are already seated.";
		qLSAS2.items[14] = "Being the center of attention.";
		qLSAS2.items[15] = "Speaking up at a meeting.";
		qLSAS2.items[16] = "Taking a test.";
		qLSAS2.items[17] = "Expressing a disagreement or disapproval to people you don't know very well.";
		qLSAS2.items[18] = "Looking at people you don’t know very well in the eyes.";
		qLSAS2.items[19] = "Giving a report to a group.";
		qLSAS2.items[20] = "Trying to pick up someone.";
		qLSAS2.items[21] = "Returning goods to a store.";
		qLSAS2.items[22] = "Giving a party.";
		qLSAS2.items[23] = "Resisting a high pressure salesperson.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qLSAS2.Run();
	}
}
