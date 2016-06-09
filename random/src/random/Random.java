package random;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class Random {
	@Resource
	private WebServiceContext wsc;

	@SuppressWarnings("unchecked")
	public double geraRandom(double max) {
		MessageContext mc = wsc.getMessageContext();
		
		// detalhes do header
		Map<String, List<String>> headers = (Map<String, List<String>>) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
		List<String> usernameList = (List<String>) headers.get("Username");
		List<String> passwordList = (List<String>) headers.get("Password");
		
		String username = usernameList != null ? usernameList.get(0).toString() : null;
		String password = passwordList != null ? passwordList.get(0).toString() : null;
		
		System.out.println(username);
		System.out.println(password);
		
		if ("user".equals(username) && "p@ss".equals(password)) {
			return Math.random() * max;
		} else {
			throw new RuntimeException("usuário ou senha incorretos...");
		}
	}
}
