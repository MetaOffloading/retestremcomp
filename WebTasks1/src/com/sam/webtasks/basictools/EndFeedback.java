package com.sam.webtasks.basictools;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sam.webtasks.client.SessionInfo;
import com.sam.webtasks.client.SequenceHandler;
import com.google.gwt.user.client.ui.TextArea;

public class EndFeedback {
	public static void Run() {
		
		
		
        final HTML goodbyeText = new HTML("You have now completed the experiment. Thank you for taking part.");
		
		final HTML commentText = new HTML("<br><br>Do you have any concerns about "
                + "this experiment, or is there anything else you would like to tell "
                + "the experimenter (e.g., were the loading times for this task okay)?");

		final TextArea commentTextArea = new TextArea();

        commentTextArea.setCharacterWidth(128);
        commentTextArea.setVisibleLines(4);

        final Button continueButton = new Button("Continue to payment link");

        final VerticalPanel commentPanel = new VerticalPanel();

        commentPanel.add(commentText);
        commentPanel.add(commentTextArea);
        commentPanel.add(continueButton);

        RootPanel.get().add(goodbyeText);
        RootPanel.get().add(commentPanel);
        
        
        
        continueButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                	

                String data = TimeStamp.Now() + ",";
        		data = data + SessionInfo.participantID + ",";
        		data = data + commentTextArea.getText();
             

                PHP.logData("endFeedback", data, true);
                RootPanel.get().remove(goodbyeText);
                RootPanel.get().remove(commentPanel);
                
	            new Timer() {
	                public void run() {
	                	SequenceHandler.Next();
	                }
	            }.schedule(500);

                
            }
        });

        
    }
}
