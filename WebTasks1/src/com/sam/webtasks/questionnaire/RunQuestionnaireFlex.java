package com.sam.webtasks.questionnaire;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sam.webtasks.basictools.PHP;

public class RunQuestionnaireFlex {
	public static void main(final QuestionnaireFlex q) {
		final RadioButton[][] radioButton = new RadioButton[q.nItems][q.maxOptions];
        final HorizontalPanel[][] radioButtonPanel = new HorizontalPanel[q.nItems][q.maxOptions];
        final HorizontalPanel[] itemPanel = new HorizontalPanel[q.nItems];
        final HTML optionHTML[] = new HTML[q.maxOptions];
        final HorizontalPanel[] optionHTMLPanel = new HorizontalPanel[q.maxOptions];
        final HorizontalPanel optionPanel = new HorizontalPanel();
        final VerticalPanel questionPanel = new VerticalPanel();
        final HTML[] itemHTML = new HTML[q.nItems];
        final VerticalPanel screenPanel = new VerticalPanel();
        final Label spacingLabel = new Label(" ");
        final HorizontalPanel centeringPanel = new HorizontalPanel();

        final HTML instructHTML = new HTML(q.instructionText);
        
        for (int o=0; o<q.maxOptions; o++) {
            optionHTML[o] = new HTML();
            optionHTMLPanel[o] = new HorizontalPanel();
            
            optionHTMLPanel[o].setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        }

    	for (int o=0; o<q.maxOptions; o++) {
			optionHTML[o].setHTML("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		}
        
        optionPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        
        spacingLabel.setWidth((Window.getClientWidth() * q.questionWidth)+"px");
        spacingLabel.addStyleName("rightMarginSmall");
        
        optionPanel.add(spacingLabel);
        
        for (int o=0; o<q.maxOptions; o++) 
        {
            optionHTMLPanel[o].add(optionHTML[o]);
            optionPanel.add(optionHTMLPanel[o]);
        }
        
        questionPanel.add(optionPanel);
        
        for (int i=0;i<q.itemsPerPage;i++) {
            itemHTML[i] = new HTML();   
            
            itemHTML[i].setHTML(q.items[i+q.offset]);
            
            itemHTML[i].setWidth((Window.getClientWidth() * q.questionWidth)+"px");
            
            itemHTML[i].addStyleName("rightMarginSmall");
            
            itemPanel[i] = new HorizontalPanel();
            
            itemPanel[i].setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
            
            itemPanel[i].add(itemHTML[i]);
            
            int nOptions = 0;
        	for (int o=0;o<q.maxOptions;o++) {
        		if (q.options[o][i+q.offset]!="") {
        			nOptions++;
        		}
        	}
 
        	
        	for (int o=0;o<nOptions;o++) {
        		radioButton[i][o] = new RadioButton("",q.options[o][i+q.offset]);
                
                if (q.maxOptions>1) {
                    radioButton[i][o].setName("item"+i);
                } else {
                    radioButton[i][o].setName("item");
                }
                
                radioButtonPanel[i][o] = new HorizontalPanel();
                radioButtonPanel[i][o].setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
                radioButtonPanel[i][o].add(radioButton[i][o]);

                itemPanel[i].add(radioButtonPanel[i][o]);
                
                itemPanel[i].setStyleName("bottomMarginTiny");
            }
            	
 
            
            questionPanel.add(itemPanel[i]);
        }

        screenPanel.setWidth("80%");
        
        screenPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        screenPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        
        instructHTML.addStyleName("instructionText");
        instructHTML.addStyleName("bottomMarginSmall");
        optionPanel.setStyleName("bottomMarginSmall");
        
        screenPanel.add(instructHTML);
        screenPanel.add(questionPanel);
        
        final Button continueButton = new Button("Continue");
        
        continueButton.addStyleName("topMarginSmall");
        
        screenPanel.add(continueButton);
        
        centeringPanel.setWidth(Window.getClientWidth() + "px");
        centeringPanel.setHeight(Window.getClientHeight() + "px");
        
        centeringPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        centeringPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        
        centeringPanel.add(screenPanel);
        
        RootPanel.get().add(centeringPanel);

 
        for (int i=0; i<q.itemsPerPage; i++) {
        	
        	int nOptions = 0;
        	for (int o=0;o<q.maxOptions;o++) {
        		if (q.options[o][i+q.offset]!="") {
        			nOptions++;
        		}
        	}
        	
            for (int o=0; o<nOptions; o++) {
            	//we add 10 here to give a bit of spacing between options
                radioButtonPanel[i][o].setWidth(optionHTMLPanel[o].getOffsetWidth()+"px");  
            }
        }

        continueButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                int emptyResponse = 0;  

                for (int i = 0; i < q.remainingItems; i++) {
                    int response = 0;
                    int value = q.maxOptions;
                    
                    int nOptions = 0;
                	for (int o=0;o<q.maxOptions;o++) {
                		if (q.options[o][i+q.offset]!="") {
                			nOptions++;
                		}
                	}

                    for (int o = 0; o < nOptions; o++) {
                        if (radioButton[i][o].getValue()) {
                            response += value;
                        }

                        value--;
                    }

                    q.responses[i + q.offset] = (q.maxOptions + 1) - response;

                    if ((response == 0)&(q.maxOptions>1)) {
                        itemHTML[i].removeStyleName("black");
                        itemHTML[i].addStyleName("red");
                        emptyResponse=1;
                    } else {
                        itemHTML[i].addStyleName("black");
                    }
                }
                
                if (emptyResponse==0) {
                    if ((q.offset+q.itemsPerPage)<q.nItems) {
                        q.offset+=q.itemsPerPage;
                        
                        
                        screenPanel.remove(questionPanel);
                        screenPanel.remove(continueButton);
                        
                        for (int i=0;i<q.itemsPerPage;i++) {
                            questionPanel.remove(itemPanel[i]);
                        }
                        
                        for (int i=0;i<q.itemsPerPage;i++) {
                            itemHTML[i] = new HTML();   
                            
                            itemHTML[i].setHTML(q.items[i+q.offset]);
                            
                            itemHTML[i].setWidth((Window.getClientWidth() * q.questionWidth)+"px");
                            
                            itemHTML[i].addStyleName("rightMarginSmall");
                            
                            itemPanel[i] = new HorizontalPanel();
                            
                            itemPanel[i].setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
                            
                            itemPanel[i].add(itemHTML[i]);
                            
                            int nOptions = 0;
                        	for (int o=0;o<q.maxOptions;o++) {
                        		if (q.options[o][i+q.offset]!="") {
                        			nOptions++;
                        		}
                        	}
                 
                        	
                        	for (int o=0;o<nOptions;o++) {
                        		radioButton[i][o] = new RadioButton("",q.options[o][i+q.offset]);
                                
                                if (q.maxOptions>1) {
                                    radioButton[i][o].setName("item"+i);
                                } else {
                                    radioButton[i][o].setName("item");
                                }
                                
                                radioButtonPanel[i][o] = new HorizontalPanel();
                                radioButtonPanel[i][o].setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
                                radioButtonPanel[i][o].add(radioButton[i][o]);

                                itemPanel[i].add(radioButtonPanel[i][o]);
                                
                                itemPanel[i].setStyleName("bottomMarginTiny");
                            }
                            	
                 
                            
                            questionPanel.add(itemPanel[i]);
                        }
                        
                        screenPanel.add(questionPanel);
                        screenPanel.add(continueButton);
                        
                        
                        for (int i=0; i<q.itemsPerPage; i++) {
                        	
                        	int nOptions = 0;
                        	for (int o=0;o<q.maxOptions;o++) {
                        		if (q.options[o][i+q.offset]!="") {
                        			nOptions++;
                        		}
                        	}
                        	
                            for (int o=0; o<nOptions; o++) {
                            	//we add 10 here to give a bit of spacing between options
                                radioButtonPanel[i][o].setWidth(optionHTMLPanel[o].getOffsetWidth()+"px");  
                            }
                        }
                        

                        q.remainingItems = q.nItems - q.offset;

                        if (q.remainingItems > q.itemsPerPage) {
                            q.remainingItems = q.itemsPerPage;
                        } else {
                            for (int i = q.remainingItems; i < q.itemsPerPage; i++) {
                                questionPanel.remove(itemPanel[i]);
                            }
                        }
                    } else {
                        RootPanel.get().remove(centeringPanel);
                        
                        //output data

                        String data = q.name;
                    		
                        for (int i = 0; i < q.nItems; i++) {
                        	data = data + ", " + q.responses[i];		
                        }
                        
                    	PHP.logData("completedQuestionnaire", data, true);
                    	
                    }
                }
            }
        });
	}
}
