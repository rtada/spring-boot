package br.com.rtada.list;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("listavip")
	public String listaConvidados(){
	    return "listguest";
	}	
}
