package io.vteial.springbootadmin.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	final Logger _log = LoggerFactory.getLogger(DefaultController.class);

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public @ResponseBody String ping() {
		return "Ping Pong!";
	}
}
