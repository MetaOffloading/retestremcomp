package com.sam.webtasks.client;
// Schizotypy by Mason, Linney, & Claridge (2005)


import com.sam.webtasks.questionnaire.Questionnaire;

public class Schizotypy {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire qSchizotypy = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qSchizotypy.name = "qSchizotypy";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qSchizotypy.instructionText = "A number of statements which people have used to describe themselves "
				+ "are given on the following pages.<br><br>Read each statement and then click the "
				+ "appropriate answer to indicate how you GENERALLY feel. There are no right or "
				+ "wrong answers.<br><br>Do not spend too much time on any one statement, but give "
				+ "the answer which seems to describe your present feelings best.";

		//How many response options does the questionnaire have?
		qSchizotypy.nOptions = 2;

		//How many items (i.e. questions) does the questionnaire have?
		qSchizotypy.nItems = 43;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qSchizotypy.itemsPerPage = 7;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qSchizotypy.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qSchizotypy.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		qSchizotypy.options[0] = "No";
		qSchizotypy.options[1] = "Yes";

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		qSchizotypy.items[0] = "When in the dark do you often see shapes and forms even though there is nothing there?";
		qSchizotypy.items[1] = "Are your thoughts sometimes so strong that you can almost hear them?";
		qSchizotypy.items[2] = "Have you ever thought that you had special, almost magical powers?";
		qSchizotypy.items[3] = "Have you sometimes sensed an evil presence around you, even though you could not see it?";
		qSchizotypy.items[4] = "Do you think that you could learn to read other's minds if you wanted to?";
		qSchizotypy.items[5] = "When you look in the mirror does your face sometimes seem quite different from usual?";
		qSchizotypy.items[6] = "Do ideas and insights sometimes come to you so fast that you cannot express them all?";
		qSchizotypy.items[7] = "Can some people make you aware of them just by thinking about you?";
		qSchizotypy.items[8] = "Does a passing thought ever seem so real it frightens you?";
		qSchizotypy.items[9] = "Do you feel that your accidents are caused by mysterious forces?";
		qSchizotypy.items[10] = "Do you ever have a sense of vague danger or sudden dread for reasons that you do not understand?";
		qSchizotypy.items[11] = "Does your sense of smell sometimes become unusually strong?";
		qSchizotypy.items[12] = "Are you easily confused if too much happens at the same time?";
		qSchizotypy.items[13] = "Do you frequently have difficulty in starting to do things?";
		qSchizotypy.items[14] = "Are you a person whose mood goes up and down easily?";
		qSchizotypy.items[15] = "Do you dread going into a room by yourself where other people have already gathered and are talking?";
		qSchizotypy.items[16] = "Do you find it difficult to keep interested in the same thing for a long time?";
		qSchizotypy.items[17] = "Do you often have difficulties in controlling your thoughts?";
		qSchizotypy.items[18] = "Are you easily distracted from work by daydreams?";
		qSchizotypy.items[19] = "Do you ever feel that your speech is difficult to understand because the words are all mixed up and don't make sense?";
		qSchizotypy.items[20] = "Are you easily distracted when you read or talk to someone?";
		qSchizotypy.items[21] = "Is it hard for you to make decisions?";
		qSchizotypy.items[22] = "When in a crowded room, do you often have difficulty in following a conversation?'";
		qSchizotypy.items[23] = "Are there very few things that you have ever enjoyed doing?";
		qSchizotypy.items[24] = "Are you much too independent to get involved with other people?";
		qSchizotypy.items[25] = "Do you love having your back massaged?";
		qSchizotypy.items[26] = "Do you find the bright lights of a city exciting to look at?";
		qSchizotypy.items[27] = "Do you feel very close to your friends?";
		qSchizotypy.items[28] = "Has dancing or the idea of it always seemed dull to you?";
		qSchizotypy.items[29] = "Do you like mixing with people?";
		qSchizotypy.items[30] = "Is trying new foods something you have always enjoyed?";
		qSchizotypy.items[31] = "Have you often felt uncomfortable when your friends touch you?";
		qSchizotypy.items[32] = "Do you prefer watching television to going out with people?";
		qSchizotypy.items[33] = "Do you consider yourself to be pretty much an average sort of person?";
		qSchizotypy.items[34] = "Would you like other people to be afraid of you?";
		qSchizotypy.items[35] = "Do you often feel the impulse to spend money which you know you can't afford?";
		qSchizotypy.items[36] = "Are you usually in an average kind of mood, not too high and not too low?";
		qSchizotypy.items[37] = "Do you at times have an urge to do something harmful or shocking?";
		qSchizotypy.items[38] = "Do you stop to think things over before doing anything?";
		qSchizotypy.items[39] = "Do you often overindulge in alcohol or food?";
		qSchizotypy.items[40] = "Do you ever have the urge to break or smash things?";
		qSchizotypy.items[41] = "Have you ever felt the urge to injure yourself?";
		qSchizotypy.items[42] = "Do you often feel like doing the opposite of what other people suggest even though you know they are right?";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qSchizotypy.Run();
	}
}
