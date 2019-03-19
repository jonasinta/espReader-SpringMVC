package jonas.springmvc.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jonas.springmvc.controller.modelStuff.DaoForEspAccess;
import jonas.springmvc.controller.modelStuff.esp_chipId_Table_DataClass;
import jonas.springmvc.controller.modelStuff.esp_chip_Table_DataClass;
 
@Controller
@RequestMapping("/selectChipId")
public class HelloWorldController {
 
    @Autowired
    private DaoForEspAccess contactDAO; 
    
    Logger logger = Logger.getLogger(this.getClass().getName());
	@RequestMapping(value="/selectChipId", method = RequestMethod.GET)
    public ModelAndView sayHello(HttpSession session) throws ParseException {
		logger.info("inside /selectChipId" );
		int userId = 1;
		ModelAndView modelNview = new ModelAndView("selectChip");
		List<esp_chipId_Table_DataClass> theChipList = contactDAO.getInstance_chipid(userId);
		Date lastData = contactDAO.timeSince("esp408776");
		//Date lastData = contactDAO.timeSince("esp14056893");
		logger.info("date returned"+ lastData.toString());
		modelNview.addObject("chiplist", theChipList);
		session.setAttribute("session-theChipList" , theChipList);
		return modelNview;
    }
	
	@RequestMapping(value="/showTable", method = RequestMethod.POST)
    public String showTable140(@ModelAttribute("tablename") String tablename,  ModelMap model, HttpSession session) {
		logger.info("1tablename is "+tablename );
		List<esp_chip_Table_DataClass> chipData = contactDAO.getTable(tablename);
		logger.info("2tablename is "+tablename );
        model.addAttribute("chipData", chipData);
        model.addAttribute("chiplist",session.getAttribute("session-theChipList") );
        
        return "showChipData";
    }
 
    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
    	//logger.info("inside /helloagain" );
    	model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
 
}