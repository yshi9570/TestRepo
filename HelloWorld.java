package gov.irs.jaag.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	public String sayHello (String name);
}
