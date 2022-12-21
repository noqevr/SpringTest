package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MainController {



    @RequestMapping(value="/")
    public String main() {
        return "index";
    }
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat(Locale locale, Model model) {
        return "chat";
    }

    @RequestMapping(value = "/hite", method = RequestMethod.GET)
    public String hite(Locale locale, Model model) {
        return "hite";
    }
    @RequestMapping(value = "/pd", method = RequestMethod.GET)
    public String solo(Locale locale, Model model) {
        return "pd";
    }
    
    @Value("${application.message:환영합니다!}")
    private String message = "환영합니다!";
    
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
    	var date = new Date(0,0,0);
        model.put("time", date);
        model.put("message", this.message);
        return "welcome";
    }
    
//    @RequestMapping(value = "/download", method = RequestMethod.GET)
//    public void getFile(HttpServletResponse response) {
//        try {
//            DefaultResourceLoader loader = new DefaultResourceLoader();
//            InputStream is = loader.getResource("classpath:img/050952_m_20220809_013354.pdf").getInputStream();
//            IOUtils.copy(is, response.getOutputStream());
//            response.setHeader("Content-Disposition", "attachment; filename=050952_m_20220809_013354.pdf");
//            response.flushBuffer();
//        } catch (IOException ex) {
//            throw new RuntimeException("IOError writing file to output stream");
//        }
//    }
    
    @RequestMapping(value = "/download", method = RequestMethod.GET)
 public void getFile(HttpServletResponse response) {
    	
    	
    }
}
