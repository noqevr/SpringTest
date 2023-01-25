package sample.spring.yse;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class BookController {
	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/")
	public ModelAndView create() {
	    return new ModelAndView("create");
	}
	
	
	
	@RequestMapping(value = "create", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView createPost(Model model, @RequestParam Map<String, Object> map) {
	    
		/*map.put("title", "title");
		System.out.println("title : " + (String) map.get("title"));
		map.put("title", model.getAttribute("category"));
		System.out.println("category : " + (String) map.get("category"));
		map.put("title", model.getAttribute("price"));
		System.out.println("price : " + (String) map.get("price"));*/
				
		ModelAndView mav = new ModelAndView();
	    
		System.out.println("1");
	    String bookId = this.bookService.create(map);
	    System.out.println("2");
	    if (bookId == null) {
	    	System.out.println("3");
	        mav.setViewName("redirect:/");
	    }else {
	    	System.out.println("4");
	        mav.setViewName("redirect:/detail?bookId=" + bookId); 
	        System.out.println("5");
	    }  

	    return mav;
	    
	}

//	@RequestMapping(value = "/create2", method = RequestMethod.POST)
//	public String main(HttpServletRequest request) {
//		
//		String title = request.getParameter("title");
// 		String category = request.getParameter("category");
// 		String price = request.getParameter("price");
//		
//		return "create2";
//	}
	
	
	@RequestMapping(value = "detail", method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
	    Map<String, Object> detailMap = this.bookService.detail(map);
	    System.out.println("5-1");
	    ModelAndView mav = new ModelAndView();
	    System.out.println("1.1");
	    mav.addObject("data", detailMap);
	    System.out.println("2.1");
	    String bookId = map.get("bookId").toString();
	    System.out.println("3.1");
	    mav.addObject("bookId", bookId);
	    System.out.println("4.1");
	    mav.setViewName("detail");
	    System.out.println("5.1");
	    return mav;
	}
	
}
