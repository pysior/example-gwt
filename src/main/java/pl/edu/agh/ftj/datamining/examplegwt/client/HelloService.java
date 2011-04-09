package pl.edu.agh.ftj.datamining.examplegwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hello")
public interface HelloService extends RemoteService {

	public String getWelcomeMessage(String name);
}
