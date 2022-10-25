package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.IQ;

public class ICAR {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		IQ qICAR = new IQ();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		qICAR.name = "qICAR";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		qICAR.instructionText = "You will now proceed to complete a short reasoning test.<br><br>Please read each question carefully and "
				+ "answer as best as you can.";

		//How many response options does the questionnaire have?
		qICAR.maxOptions = 8;

		//How many items (i.e. questions) does the questionnaire have?
		qICAR.nItems = 16;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		qICAR.itemsPerPage = 1;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		qICAR.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		qICAR.Init();
		
		for (int o=0;o<qICAR.nItems;o++) {
			qICAR.options[0][o] = "";
			qICAR.options[1][o] = "";
			qICAR.options[2][o] = "";
			qICAR.options[3][o] = "";
			qICAR.options[4][o] = "";
			qICAR.options[5][o] = "";
			qICAR.options[6][o] = "";
			qICAR.options[7][o] = "";
			qICAR.imagefiles[0][o] = "";
			qICAR.imagefiles[1][o] = "";
		}

		qICAR.items[0] = "1. What number is one fifth of one fourth of one ninth of 900?";
		qICAR.options[0][0] = "2";
		qICAR.options[1][0] = "3";
		qICAR.options[2][0] = "4";
		qICAR.options[3][0] = "5";
		qICAR.options[4][0] = "6";
		qICAR.options[5][0] = "7";
		qICAR.items[1] = "2. Zach is taller than Matt and Richard is shorter than Zach.<br>Which of the following statements would be the most accurate?";
		qICAR.options[0][1] = "Richard is taller than Matt";
		qICAR.options[1][1] = "Richard is shorter than Matt";
		qICAR.options[2][1] = "Richard is as tall as Matt";
		qICAR.options[3][1] = "It's impossible to tell";
		qICAR.items[2] = "3. Joshua is 12 years old and his sister is three times as old as he.<br>When Joshua is 23 years old, how old will his sister be?";
		qICAR.options[0][2] = "25";
		qICAR.options[1][2] = "39";
		qICAR.options[2][2] = "44";
		qICAR.options[3][2] = "47";
		qICAR.options[4][2] = "53";
		qICAR.options[5][2] = "57";
		qICAR.items[3] = "4. If the day after tomorrow is two days before Thursday then what day is it today?";
		qICAR.options[0][3] = "Friday";
		qICAR.options[1][3] = "Monday";
		qICAR.options[2][3] = "Wednesday";
		qICAR.options[3][3] = "Saturday";
		qICAR.options[4][3] = "Tuesday";
		qICAR.options[5][3] = "Sunday";
		qICAR.items[4] = "5. In the following alphanumeric series, what letter comes next? K N P S U";
		qICAR.options[0][4] = "S";
		qICAR.options[1][4] = "T";
		qICAR.options[2][4] = "U";
		qICAR.options[3][4] = "V";
		qICAR.options[4][4] = "W";
		qICAR.options[5][4] = "X";
		qICAR.items[5] = "6. In the following alphanumeric series, what letter comes next? V Q M J H";
		qICAR.options[0][5] = "E";
		qICAR.options[1][5] = "F";
		qICAR.options[2][5] = "G";
		qICAR.options[3][5] = "H";
		qICAR.options[4][5] = "I";
		qICAR.options[5][5] = "J";
		qICAR.items[6] = "7. In the following alphanumeric series, what letter comes next? I J L O S";
		qICAR.options[0][6] = "T";
		qICAR.options[1][6] = "U";
		qICAR.options[2][6] = "V";
		qICAR.options[3][6] = "X";
		qICAR.options[4][6] = "Y";
		qICAR.options[5][6] = "Z";
		qICAR.items[7] = "8. In the following alphanumeric series, what letter comes next? Q S N P L";
		qICAR.options[0][7] = "J";
		qICAR.options[1][7] = "H";
		qICAR.options[2][7] = "I";
		qICAR.options[3][7] = "N";
		qICAR.options[4][7] = "M";
		qICAR.options[5][7] = "L";
		qICAR.items[8] = "9. Which figure fits into the missing slot?";
		qICAR.options[0][8] = "A";
		qICAR.options[1][8] = "B";
		qICAR.options[2][8] = "C";
		qICAR.options[3][8] = "D";
		qICAR.options[4][8] = "E";
		qICAR.options[5][8] = "F";
		qICAR.imagefiles[0][8] = "mx45_q.png";
		qICAR.imagefiles[1][8] = "mx45_a.png";
		qICAR.items[9] = "10. Which figure fits into the missing slot?";
		qICAR.options[0][9] = "A";
		qICAR.options[1][9] = "B";
		qICAR.options[2][9] = "C";
		qICAR.options[3][9] = "D";
		qICAR.options[4][9] = "E";
		qICAR.options[5][9] = "F";
		qICAR.imagefiles[0][9] = "mx46_q.png";
		qICAR.imagefiles[1][9] = "mx46_a.png";
		qICAR.items[10] = "11. Which figure fits into the missing slot?";
		qICAR.options[0][10] = "A";
		qICAR.options[1][10] = "B";
		qICAR.options[2][10] = "C";
		qICAR.options[3][10] = "D";
		qICAR.options[4][10] = "E";
		qICAR.options[5][10] = "F";
		qICAR.imagefiles[0][10] = "mx47_q.png";
		qICAR.imagefiles[1][10] = "mx47_a.png";
		qICAR.items[11] = "12. Which figure fits into the missing slot?";
		qICAR.options[0][11] = "A";
		qICAR.options[1][11] = "B";
		qICAR.options[2][11] = "C";
		qICAR.options[3][11] = "D";
		qICAR.options[4][11] = "E";
		qICAR.options[5][11] = "F";
		qICAR.imagefiles[0][11] = "mx55_q.png";
		qICAR.imagefiles[1][11] = "mx55_a.png";
		qICAR.items[12] = "13. All the cubes below have a different image on each side.<br>Select the choice that represents a rotation of the cube labeled X.";
		qICAR.options[0][12] = "A";
		qICAR.options[1][12] = "B";
		qICAR.options[2][12] = "C";
		qICAR.options[3][12] = "D";
		qICAR.options[4][12] = "E";
		qICAR.options[5][12] = "F";
		qICAR.options[6][12] = "G";
		qICAR.options[7][12] = "H";
		qICAR.imagefiles[0][12] = "rsd3_q.png";
		qICAR.items[13] = "14. All the cubes below have a different image on each side.<br>Select the choice that represents a rotation of the cube labeled X.";
		qICAR.options[0][13] = "A";
		qICAR.options[1][13] = "B";
		qICAR.options[2][13] = "C";
		qICAR.options[3][13] = "D";
		qICAR.options[4][13] = "E";
		qICAR.options[5][13] = "F";
		qICAR.options[6][13] = "G";
		qICAR.options[7][13] = "H";
		qICAR.imagefiles[0][13] = "rsd4_q.png";
		qICAR.items[14] = "15. All the cubes below have a different image on each side.<br>Select the choice that represents a rotation of the cube labeled X.";
		qICAR.options[0][14] = "A";
		qICAR.options[1][14] = "B";
		qICAR.options[2][14] = "C";
		qICAR.options[3][14] = "D";
		qICAR.options[4][14] = "E";
		qICAR.options[5][14] = "F";
		qICAR.options[6][14] = "G";
		qICAR.options[7][14] = "H";
		qICAR.imagefiles[0][14] = "rsd6_q.png";
		qICAR.items[15] = "16. All the cubes below have a different image on each side.<br>Select the choice that represents a rotation of the cube labeled X.";
		qICAR.options[0][15] = "A";
		qICAR.options[1][15] = "B";
		qICAR.options[2][15] = "C";
		qICAR.options[3][15] = "D";
		qICAR.options[4][15] = "E";
		qICAR.options[5][15] = "F";
		qICAR.options[6][15] = "G";
		qICAR.options[7][15] = "H";
		qICAR.imagefiles[0][15] = "rsd8_q.png";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		qICAR.Run();
	}
}


