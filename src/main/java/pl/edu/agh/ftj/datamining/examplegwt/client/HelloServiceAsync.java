package pl.edu.agh.ftj.datamining.examplegwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloServiceAsync {
 	public void getWelcomeMessage(String name, AsyncCallback<String> callback);
}