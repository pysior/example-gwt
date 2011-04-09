package pl.edu.agh.ftj.datamining.examplegwt.server;

import pl.edu.agh.ftj.datamining.examplegwt.client.HelloService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class HelloServiceImpl extends RemoteServiceServlet implements HelloService {

	private static final long serialVersionUID = 1L;

	@Override
	public String getWelcomeMessage(String name) {
		return "Welcome: " + name;
	}

}
