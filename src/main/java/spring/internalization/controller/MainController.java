package spring.internalization.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    public final Logger logger = LoggerFactory.getLogger(MainController.class);

    public MainController() {
        logger.warn("Main controller started ...");
    }

    @GetMapping("/index")
    public ModelAndView getHomepage() {
        return new ModelAndView("index");
    }
}
