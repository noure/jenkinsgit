package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping(value="/form",method=RequestMethod.POST)
	public String greeting(
			@RequestParam(value = "double1", required = false) String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
