package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

	
	private IStudentService studentService;
	
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="", method=RequestMethod.GET) // empty value uses mapping or index
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", studentService.listAllStudents());
        return model;
    }
	
	   @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	    public ModelAndView deleteStudents(@PathVariable long id) {
		   	studentService.deleteStudent(id);
	        return new ModelAndView("redirect:/index");
	    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView studentRegister(@ModelAttribute("student") // sınıf tipinde getir
													Student student){
    	ModelAndView model = new ModelAndView("index");
    	if(student !=null){
    		studentService.saveStudent(student);
    	model.addObject("warning", "Success");
    	
    	}
    	else{
    		model.addObject("danger","Error" );
    		
    	}
    	return new ModelAndView("redirect:/index");
    }

    	  	@RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    	    public ModelAndView edit(@PathVariable("id") long id) {
    		  ModelAndView model = new ModelAndView("edit");
    	        Student student = studentService.getStudentById(id);
    	        model.addObject("student", student);
    	        return model;
    	    }

    	    @RequestMapping(value = "/update", method = RequestMethod.POST)
			public ModelAndView update(@RequestParam("id") long id, // istenen tek değeri getir
    	                               @RequestParam("name") String name, // modelattribute get methodu ile çekilebilir
									   @RequestParam("surname") String surname,
    	    						   @RequestParam("phone") String phone,
									   @RequestParam("city") String city,
									   @RequestParam("district") String district,
									   @RequestParam("description") String description) {
    	        Student student = studentService.getStudentById(id);
    	        student.setName(name);
    	        student.setSurname(surname);
    	        student.setPhone(phone);
    	        student.setCity(city);
			   	student.setDistrict(district);
			   	student.setDescription(description);
			   	studentService.saveStudent(student);
    	        return new ModelAndView("redirect:/index");
    	    }
   
}
