package com.sam.webtasks.client;



public class RunNextQuestionnaire {
	public static void Run(int iQuest) {
		
		switch (iQuest) {
		case 0:
			AES_short.Run();
			break;
		case 1:
			SDS_short.Run();
			break;
		case 2:
			EAT26_short.Run();
			break;
		case 3:
			BIS11_short.Run();
			break;
		case 4:
			OCIR_short.Run();
			break;
		case 5:
			STAI_short.Run();
			break;
		}
		
	}
}
