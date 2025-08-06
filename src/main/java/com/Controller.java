package com;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	static Logger L= Logger.getLogger(Controller.class);
	@GetMapping("/getlog")
public String getLogging() {
		L.info("Controller Wlm");
		L.warn("Warning");
	return "Helloworld";
}
}
