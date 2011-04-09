package pl.edu.agh.ftj.datamining.examplegwt.client;

import java.util.logging.Logger;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Button;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;

/*
 * Main client class.
 */
public class Application implements EntryPoint {

	private static final Logger LOGGER = Logger.getLogger(Application.class.getName());	
	private final HelloServiceAsync helloService = (HelloServiceAsync)GWT.create(HelloService.class);
	
	public void onModuleLoad() {
		LOGGER.info("initialize project..");
		
		HLayout mainLayout = new HLayout();
		mainLayout.setWidth100();
		mainLayout.setHeight100();
		Button helloButton = new Button("Show");
		mainLayout.addMember(helloButton);
		
		helloButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				helloService.getWelcomeMessage("i don't know your name ;P.", new AsyncCallback<String>() {
					
					@Override
					public void onSuccess(String result) {
						SC.say(result);
					}
					
					@Override
					public void onFailure(Throwable caught) {
						SC.warn(caught.getMessage());
					}
				});
			}
		});
		mainLayout.draw();
	}
}
