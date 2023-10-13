package dev.moskal.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/design")
@SessionAttributes("exam")

public class DesignExamController {
	@ModelAttribute
	public void addExamToModel(Model model) {
		
	}
}
