package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.IQ;

public class ICAR5 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		IQ qICAR5 = new IQ();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qICAR5.name = "qICAR5";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qICAR5.instructionText = "You will now proceed to complete a short IQ test.<br><br>Please read each question carefully and "
				+ "answer as best as you can.";

		//How many response options does the questionnaire have?
		qICAR5.maxOptions = 8;

		//How many items (i.e. questions) does the questionnaire have?
		qICAR5.nItems = 5;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qICAR5.itemsPerPage = 1;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qICAR5.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qICAR5.Init();
		
		for (int o=0;o<qICAR5.nItems;o++) {
			qICAR5.options[0][o] = "";
			qICAR5.options[1][o] = "";
			qICAR5.options[2][o] = "";
			qICAR5.options[3][o] = "";
			qICAR5.options[4][o] = "";
			qICAR5.options[5][o] = "";
			qICAR5.options[6][o] = "";
			qICAR5.options[7][o] = "";
			qICAR5.imagefiles[0][o] = "";
			qICAR5.imagefiles[1][o] = "";
		}

		qICAR5.items[0] = "1. What number is one fifth of one fourth of one ninth of 900?";
		qICAR5.options[0][0] = "2";
		qICAR5.options[1][0] = "3";
		qICAR5.options[2][0] = "4";
		qICAR5.options[3][0] = "5";
		qICAR5.options[4][0] = "6";
		qICAR5.options[5][0] = "7";
		qICAR5.imagefiles[0][0] = "mx45_q.png";
		qICAR5.items[1] = "2. If the day after tomorrow is two days before Thursday then what day is it today?";
		qICAR5.options[0][1] = "Friday";
		qICAR5.options[1][1] = "Monday";
		qICAR5.options[2][1] = "Wednesday";
		qICAR5.options[3][1] = "Saturday";
		qICAR5.options[4][1] = "Tuesday";
		qICAR5.options[5][1] = "Sunday";
		qICAR5.items[2] = "3. In the following alphanumeric series, what letter comes next? Q S N P L";
		qICAR5.options[0][2] = "J";
		qICAR5.options[1][2] = "H";
		qICAR5.options[2][2] = "I";
		qICAR5.options[3][2] = "N";
		qICAR5.options[4][2] = "M";
		qICAR5.options[5][2] = "L";
		qICAR5.items[3] = "4. Which figure fits into the missing slot?";
		qICAR5.options[0][3] = "A";
		qICAR5.options[1][3] = "B";
		qICAR5.options[2][3] = "C";
		qICAR5.options[3][3] = "D";
		qICAR5.options[4][3] = "E";
		qICAR5.options[5][3] = "F";
		qICAR5.imagefiles[0][3] = "mx46_q.png";
		qICAR5.imagefiles[1][3] = "mx46_a.png";
		qICAR5.items[4] = "5. All the cubes below have a different image on each side.<br>Select the choice that represents a rotation of the cube labeled X.";
		qICAR5.options[0][4] = "A";
		qICAR5.options[1][4] = "B";
		qICAR5.options[2][4] = "C";
		qICAR5.options[3][4] = "D";
		qICAR5.options[4][4] = "E";
		qICAR5.options[5][4] = "F";
		qICAR5.options[6][4] = "G";
		qICAR5.options[7][4] = "H";
		qICAR5.imagefiles[0][4] = "rsd4_q.png";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qICAR5.Run();
	}
}


