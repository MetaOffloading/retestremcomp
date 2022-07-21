package com.sam.webtasks.client;
// Extended Mind Questionnaire (XMQ) by Nijssen, Schaap & Verheijen (2018)


import com.sam.webtasks.questionnaire.Questionnaire;

public class XMQ {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qXMQ = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qXMQ.name = "qXMQ";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qXMQ.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qXMQ.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		qXMQ.nItems = 12;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qXMQ.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qXMQ.questionWidth = 0.3;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qXMQ.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qXMQ.options[0] = "1<br>(Does not describe me at all)";
		qXMQ.options[1] = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		qXMQ.options[2] = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		qXMQ.options[3] = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
		qXMQ.options[4] = "5<br>(Describes me very well)";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qXMQ.items[0] = "My smartphone, tablet, or computer is a part of me.";
		qXMQ.items[1] = "I use my smartphone, tablet, or computer as an extension of myself.";
		qXMQ.items[2] = "My smartphone, tablet, or computer often serves as my memory.";
		qXMQ.items[3] = "I am very dependent on my smartphone, tablet, or computer.";
		qXMQ.items[4] = "Online information is accessible to me at any given time.";
		qXMQ.items[5] = "If I cannot recall something, I immediately reach for my smartphone, tablet, or\n" + 
				"computer to look it up.";
		qXMQ.items[6] = "I trust information from my smartphone, tablet, or computer as much as my own\n" + 
				"memory.";
		qXMQ.items[7] = "Social media are important to me for contacting my friends.";
		qXMQ.items[8] = "When I want to get in touch with friends, I immediately reach for my smartphone,\n" + 
				"tablet, or computer.";
		qXMQ.items[9] = "I always have my smartphone, tablet, or computer within reach.";
		qXMQ.items[10] = "I am very dependent on my smartphone, tablet, or computer to remember important\n" + 
				"things such as birthdays or appointments.";
		qXMQ.items[11] = " It makes more sense to me to address someone in person than through\n" + 
				"social media.";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qXMQ.Run();
	}
}
